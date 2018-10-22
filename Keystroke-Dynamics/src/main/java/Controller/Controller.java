/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.MainFrame;
import Data.InsertDB;
import Data.Typing;
import Data.User;
import GUI.Panel;
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
   /* private ArrayList<Double> flightTimesT2 = new ArrayList<>();
    private ArrayList<Double> flightTimesT3 = new ArrayList<>();
    private ArrayList<Double> flightTimesT4 = new ArrayList<>();*/
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
    
  /*  public void addFlightTimeT2(double flightTimeT2)
    {
        flightTimesT2.add(flightTimeT2);
    }
    
    public void addFlightTimeT3(double flightTimeT3)
    {
        flightTimesT3.add(flightTimeT3);
    }
    
    public void addFlightTimeT4(double flightTimeT4)
    {
        flightTimesT4.add(flightTimeT4);
    }*/
    
    public void addTyping()
    {
        Typing typing = new Typing();
        typing.setTypings(dwellTimes, flightTimesT1);
        typings.add(typing);
        dwellTimes.clear();
        flightTimesT1.clear();
        /*flightTimesT2.clear();
        flightTimesT3.clear();
        flightTimesT4.clear();*/
    }

    public void saveToDataBase(String name) {
       User user = new User(name, typings);
       InsertDB insertDB = new InsertDB();
       insertDB.Start(user);
    }

    public void removeFlightTimeT1(double flightTimeT1) {
        flightTimesT1.remove(flightTimeT1);
    }

    public void removeDwellTime(double dwellTime) {
        dwellTimes.remove(dwellTime);
    }
    
    public void CreateConnection() throws ClassNotFoundException, SQLException{
        // az adatbázis driver meghatározása
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        // az adatbázis definiálása
        String url = "jdbc:derby://localhost:1527/KeyStrokeDynamicsDB";
        // kapcsolodas az adatbázishoz
        connection = DriverManager.getConnection(url, "feAnnamari", "keystroke");
    }
}
