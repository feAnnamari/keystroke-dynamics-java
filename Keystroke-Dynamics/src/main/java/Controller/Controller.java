/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.MainFrame;
import Data.DataBaseManager;
import Data.Typing;
import Data.User;
import GUI.Panel;
import GUI.RegistrationFrame;
import GUI.RegistrationPanel;
import MachineLearning.Network;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeMath.max;
import static jdk.nashorn.internal.objects.NativeMath.min;

/**
 *
 * @author Annamari
 */
public class Controller {
    private Panel panel;
    private MainFrame mainFrame;
    private RegistrationPanel regPanel;

    public RegistrationPanel getRegPanel() {
        return regPanel;
    }

    public void setRegPanel(RegistrationPanel regPanel) {
        this.regPanel = regPanel;
    }
    
    private double DELTA = 0.03;
    
    private ArrayList<Double> dwellTimes = new ArrayList<>();
    private ArrayList<Double> flightTimesT1 = new ArrayList<>();
    private ArrayList<Typing> typings = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Double> inputs = new ArrayList<>();
    
    private double[] target = new double[]{1,0};
    private double[] intruderTarget = new double[]{0,1};
    
    private int HIDDEN_LAYER_NUM = 20;
    private int OUTPUT_NUM = 2;
    
    private Connection connection;

    public Controller(Panel panel, MainFrame mainFrame) {
        this.panel = panel;
        this.mainFrame = mainFrame;
    }

    public void setting() {
        panel.setController(this);
    }    
    
    public void addDwellTime(double dwellTime)
    {
        dwellTimes.add(dwellTime);
    }
    
    public void addFlightTimeT1(double flightTimeT1)
    {
        flightTimesT1.add(flightTimeT1);
    }
    
    public void addTyping()
    {
        Typing typing = new Typing();
        typing.setTypings(dwellTimes, flightTimesT1);
        typings.add(typing);
    }

    public void saveToDataBase(String name) {
       //User user = new User(name, typings);
       DataBaseManager insertDB = new DataBaseManager();
       insertDB.insertTypings(typings);
       panel.txtSetEnable(true);
       //typings.clear();
    }
    

    public void calculate(ArrayList<Long> pressTimes, ArrayList<Long> releaseTimes) {
        for (int i = 0; i < pressTimes.size(); i++) {
            dwellTimes.add(((double)releaseTimes.get(i)-(double)pressTimes.get(i))/1000);
        }
        
        for (int i = 0; i < pressTimes.size()-1; i++) {
            flightTimesT1.add(((double)pressTimes.get(i+1)-(double)releaseTimes.get(i))/1000);
        }  
        //addTyping();
        
    }

    public void registrationFrameStart() {
        RegistrationFrame regFrame = new RegistrationFrame(this);
    }

    public void calculateNeural(String email, ArrayList<Long> pressTimes, ArrayList<Long> releaseTimes, boolean learning) {
        
        //calculate(pressTimes, releaseTimes);
        
        //ArrayList<Double> normInputs = new ArrayList<>();
        ArrayList<Double> intruderinputs1 = new ArrayList<>();
        ArrayList<Double> intruderinputs2 = new ArrayList<>();
        
        
        inputs.addAll(dwellTimes);
        inputs.addAll(flightTimesT1);
        
        boolean userRegistered = false;
        
        double[] input = inputs.stream().mapToDouble(d -> d).toArray();
        
         
        for (int i = 0; i < input.length; i++) {
            intruderinputs1.add(input[i]-DELTA);
            intruderinputs2.add(input[i]+DELTA);
        }
        
        double[] intruderinput1 = intruderinputs1.stream().mapToDouble(d -> d).toArray();
        double[] intruderinput2 = intruderinputs2.stream().mapToDouble(d -> d).toArray();
   
        Network net = null;
        for (User user : users) {
            if(user.getEmail().equals(email))
            {
                userRegistered = true;
                net = user.getNetwork();
                
            }
        }   
        if(userRegistered && !learning)
        {     
            double[] o = net.calculate(input);
            System.out.println(Arrays.toString(o));
            userRegistered = false;
            boolean success = false;
            double[] result = new double[net.calculate(input).length];
            for (int i = 0; i < result.length; i++) {
                result[i] = net.calculate(input)[i];
            }
            if(result[0]>result[1])
            {
                success = true;
            }
            regPanel.setInformation(success);
        }
        else if(!userRegistered && !learning)
        {
            JOptionPane.showMessageDialog(null, "Hibás név és/vagy jelszó!", "Hiba", JOptionPane.ERROR_MESSAGE);
        }
            
        else{
            net = new Network(input.length, HIDDEN_LAYER_NUM, OUTPUT_NUM);
            User user = new User(email, net);
            users.add(user);
            for (int i = 0; i < 14000; i++) 
            {
                net.train(input, target, 0.7); //1-0
                net.train(intruderinput1, intruderTarget, 0.5); //0-1
                net.train(intruderinput2, intruderTarget, 0.5);
            }   
 
            System.out.println("--------------- TYPING ----------------");
            System.out.println(Arrays.toString(net.calculate(input)));
            System.out.println(Arrays.toString(net.calculate(intruderinput1)));
            System.out.println(Arrays.toString(net.calculate(intruderinput2)));
            System.out.println("--------------- END TYPING ----------------");
        }
        dwellTimes.clear();
        flightTimesT1.clear();
        inputs.clear();
        intruderinputs1.clear();
        intruderinputs2.clear();
        
    }
    
    
}
