/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MachineLearning;

import java.util.ArrayList;

/**
 *
 * @author Annamari
 */
public class Neuron {
    private ArrayList<Double> listOfWeightInt; 
    private ArrayList<Double> listOfWeightOut; 

    public Neuron(ArrayList<Double> listOfWeightInt, ArrayList<Double> listOfWeightOut) {
        this.listOfWeightInt = listOfWeightInt;
        this.listOfWeightOut = listOfWeightOut;
    }
    
    public double initNeuron(){
        return 0;
    }

    public ArrayList<Double> getListOfWeightInt() {
        return listOfWeightInt;
    }

    public void setListOfWeightInt(ArrayList<Double> listOfWeightInt) {
        this.listOfWeightInt = listOfWeightInt;
    }

    public ArrayList<Double> getListOfWeightOut() {
        return listOfWeightOut;
    }

    public void setListOfWeightOut(ArrayList<Double> listOfWeightOut) {
        this.listOfWeightOut = listOfWeightOut;
    }

}
