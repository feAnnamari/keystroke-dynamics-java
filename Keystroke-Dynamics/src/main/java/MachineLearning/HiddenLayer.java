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
public class HiddenLayer extends Layer{
    
    private ArrayList<HiddenLayer> listHidden;
    private InputLayer il;
    private OutputLayer ol;    

    public ArrayList<HiddenLayer> initLayer(ArrayList<HiddenLayer> listHidden, InputLayer il, OutputLayer ol) {
        return null;
    }
    
}
