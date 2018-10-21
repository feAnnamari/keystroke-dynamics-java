/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.MainFrame;
import Data.Typing;
import Data.User;
import GUI.Panel;
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
    private ArrayList<Double> flightTimesT2 = new ArrayList<>();
    private ArrayList<Double> flightTimesT3 = new ArrayList<>();
    private ArrayList<Double> flightTimesT4 = new ArrayList<>();
    private ArrayList<Typing> typings = new ArrayList<>();

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
    
    public void addFlightTimeT2(double flightTimeT2)
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
    }
    
    public void addTyping()
    {
        Typing typing = new Typing();
        typing.setTypings(dwellTimes, flightTimesT1, flightTimesT2, flightTimesT3, flightTimesT4);
        typings.add(typing);
        dwellTimes.clear();
        flightTimesT1.clear();
        flightTimesT2.clear();
        flightTimesT3.clear();
        flightTimesT4.clear();
    }

    public void saveToDataBase(String password) {
       User user = new User(password, typings);
    }
}
