/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;

/**
 *
 * @author Annamari
 */
public class Typing {
    private ArrayList <Double> dwellTimes = new ArrayList<>();
    private ArrayList <Double> flightTimesT1 = new ArrayList<>();
    private ArrayList <Double> flightTimesT2 = new ArrayList<>();
    private ArrayList <Double> flightTimesT3 = new ArrayList<>();
    private ArrayList <Double> flightTimesT4 = new ArrayList<>();

    public Typing() {
    }
    
    public void setTypings(ArrayList<Double> dwellTimes, ArrayList<Double> flightTimesT1, ArrayList<Double> flightTimesT2, ArrayList<Double> flightTimesT3, ArrayList<Double> flightTimesT4) {
        this.dwellTimes.addAll(dwellTimes);
        this.flightTimesT1.addAll(flightTimesT1);
        this.flightTimesT2.addAll(flightTimesT2);
        this.flightTimesT3.addAll(flightTimesT3);
        this.flightTimesT4.addAll(flightTimesT4);
    }
}
