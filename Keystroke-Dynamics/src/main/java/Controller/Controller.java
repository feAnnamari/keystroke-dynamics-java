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
import GUI.RegistrationPanel;
import GUI.LoginFrame;
import GUI.LoginPanel;
import MachineLearning.Network;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Annamari
 */
public class Controller {
    private RegistrationPanel panel;
    private MainFrame mainFrame;
    private LoginPanel loginPanel;
    private LoginFrame loginFrame;
    
    private ArrayList<Double> dwellTimes = new ArrayList<>();
    private ArrayList<Double> flightTimesT1 = new ArrayList<>();
    private ArrayList<Typing> typings = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Double> inputs = new ArrayList<>();
    private ArrayList<Double> intruderinputs1 = new ArrayList<>();
    private ArrayList<Double> intruderinputs2 = new ArrayList<>();

    private double DELTA = 0.03;
    private int HIDDEN_LAYER_NUM = 20;
    private int OUTPUT_NUM = 2;
    private int LEARNING_ITERATION = 14000;
    private double INTRUDER_LEARNING_RATE = 0.5;
     private double LEARNING_RATE = 0.7;
    
    private double[] target = new double[]{1,0};
    private double[] intruderTarget = new double[]{0,1};
    

    public Controller(RegistrationPanel panel, MainFrame mainFrame) {
        this.panel = panel;
        this.mainFrame = mainFrame;
    }

    public void setting() {
        panel.setController(this);
    }    
    
    public void addTyping()
    {
        Typing typing = new Typing();
        typing.setTypings(dwellTimes, flightTimesT1);
        typings.add(typing);
    }

    /**
     * Saving the time values (dwell and flight times) of the typing into a database
     * @param name 
     */
    public void saveToDataBase() {
       DataBaseManager insertDB = new DataBaseManager();
       insertDB.insertTypings(typings);
       panel.txtSetEnable(true);
       typings.clear();
    }
    
    /**
     * Calculating the dwell and the flight times
     * @param pressTimes
     * @param releaseTimes
     */
    public void calculate(ArrayList<Long> pressTimes, ArrayList<Long> releaseTimes) {
        for (int i = 0; i < pressTimes.size(); i++) {
            dwellTimes.add(((double)releaseTimes.get(i)-(double)pressTimes.get(i))/1000);
        }
        
        for (int i = 0; i < pressTimes.size()-1; i++) {
            flightTimesT1.add(((double)pressTimes.get(i+1)-(double)releaseTimes.get(i))/1000);
        }          
    }

    public void loginFrameStart() {
        if(loginFrame == null)
        {
            loginFrame = new LoginFrame(this);
        }
        else{
            loginFrame.setVisible(true);
        }
    }

    /**
     * Create a new neural network and train it or check the user with a given input
     * @param email
     * @param pressTimes
     * @param releaseTimes
     * @param learning
     */
public void calculateNeural(String email, boolean learning) {

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
        loginPanel.setInformation(success);
    }
    else if(!userRegistered && !learning)
    {
        JOptionPane.showMessageDialog(null, "Hibás név és/vagy jelszó!", "Hiba", JOptionPane.ERROR_MESSAGE);
    }

    else{
        net = new Network(input.length, HIDDEN_LAYER_NUM, OUTPUT_NUM);
        User user = new User(email, net);
        users.add(user);
        for (int i = 0; i < LEARNING_ITERATION; i++) 
        {
            net.train(input, target, LEARNING_RATE); //1-0
            net.train(intruderinput1, intruderTarget, INTRUDER_LEARNING_RATE); //0-1
            net.train(intruderinput2, intruderTarget, INTRUDER_LEARNING_RATE);
        }   

        System.out.println("--------------- TYPING ----------------");
        System.out.println(Arrays.toString(net.calculate(input)));
        System.out.println(Arrays.toString(net.calculate(intruderinput1)));
        System.out.println(Arrays.toString(net.calculate(intruderinput2)));
        System.out.println("--------------- END TYPING ----------------");
    }
    clearLists();
}
    
    public LoginPanel getLoginPanel() {
        return loginPanel;
    }

    public void setLoginPanel(LoginPanel loginPanel) {
        this.loginPanel = loginPanel;
    }

    private void clearLists()
    {
        dwellTimes.clear();
        flightTimesT1.clear();
        inputs.clear();
        intruderinputs1.clear();
        intruderinputs2.clear(); 
    }
    
    
}
