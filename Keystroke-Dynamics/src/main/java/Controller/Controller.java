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
import GUI.ReigstrationPanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Annamari
 */
public class Controller {
    private Panel panel;
    private MainFrame mainFrame;
    
    private ArrayList<Double> dwellTimes = new ArrayList<>();
    private ArrayList<Double> flightTimesT1 = new ArrayList<>();
    private ArrayList<Typing> typings = new ArrayList<>();
    
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
        dwellTimes.clear();
        flightTimesT1.clear();
    }

    public void saveToDataBase(String name) {
       //User user = new User(name, typings);
       DataBaseManager insertDB = new DataBaseManager();
       insertDB.insertTypings(typings);
       panel.txtSetEnable(true);
    }
    
   /* public void CreateConnection() throws ClassNotFoundException, SQLException{
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        String url = "jdbc:derby://localhost:1527/KeyStrokeDynamicsDB";
        connection = DriverManager.getConnection(url, "feAnnamari", "keystroke");
    }*/

    public void calculate(ArrayList<Long> pressTimes, ArrayList<Long> releaseTimes) {
        for (int i = 0; i < pressTimes.size(); i++) {
            dwellTimes.add(((double)releaseTimes.get(i)-(double)pressTimes.get(i))/1000);
        }
        
        for (int i = 0; i < pressTimes.size()-1; i++) {
            flightTimesT1.add(((double)pressTimes.get(i+1)-(double)releaseTimes.get(i))/1000);
        }  
        addTyping();
    }

    public void registrationFrameStart() {
        RegistrationFrame regFrame = new RegistrationFrame(this);
    }
}
