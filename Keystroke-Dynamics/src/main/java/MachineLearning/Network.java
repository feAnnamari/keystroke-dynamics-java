/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MachineLearning;

/**
 *
 * @author Annamari
 */
public class Network {
    private double[][] output; //első a rétegnek, második a neuronnak tartlamazza az indexét pl. 1. réteg 2. neuron
    private double[][][] weights; //réteg, neuron, neuron és az előző réteg közötti
    private double[][] bias; //minden neuronnak 1 van
    
    private double[][] error_signal;
     private double[][] output_derivative;
    
    public final int[] NETWORK_LAYER_SIZES; // hány neuron van az egyes rétegekben (sorrendben)
    public final int INPUT_SIZE;
    public final int OUTPUT_SIZE;
    public final int NETWORK_SIZE; // rétegek száma

    public Network(int... NETWORK_LAYER_SIZES) {
        this.NETWORK_LAYER_SIZES = NETWORK_LAYER_SIZES;
        this.INPUT_SIZE = NETWORK_LAYER_SIZES[0];
        this.NETWORK_SIZE = NETWORK_LAYER_SIZES.length;
        this.OUTPUT_SIZE = NETWORK_LAYER_SIZES[NETWORK_SIZE-1];
        
        this.output = new double[NETWORK_SIZE][];
        this.weights = new double[NETWORK_SIZE][][];
        this.bias = new double[NETWORK_SIZE][];
        
        this.error_signal = new double[NETWORK_SIZE][];
        this.output_derivative = new double[NETWORK_SIZE][];
        
        for (int i = 0; i < NETWORK_SIZE; i++) { 
            this.output[i] = new double[NETWORK_LAYER_SIZES[i]]; //azért kell, mert előzőben csak azt adtuk meg hogy hány réteg van
            this.error_signal[i] = new double[NETWORK_LAYER_SIZES[i]];
            this.output_derivative[i] = new double[NETWORK_LAYER_SIZES[i]];
            this.bias[i] = NetworkTools.createRandomArray(NETWORK_LAYER_SIZES[i], -0.5, 0.7);
            
            if(i>0) //az első rétegnek nem lesz előző réteggek összecsatolása!
            {
                weights[i] = NetworkTools.createRandomArray(NETWORK_LAYER_SIZES[i], NETWORK_LAYER_SIZES[i-1], -1,1);
            }
        }
    }
    
    public double[] calculate (double... input)
    {
        if(input.length != this.INPUT_SIZE) return null;
        this.output[0] = input;
        for (int layer = 1; layer < NETWORK_SIZE; layer++) {
            for (int neuron = 0; neuron < NETWORK_LAYER_SIZES[layer]; neuron++) {
                
                double sum = bias[layer][neuron];
                for (int prevNeuron = 0; prevNeuron < NETWORK_LAYER_SIZES[layer-1]; prevNeuron++) {
                    sum+= output[layer-1][prevNeuron]*weights[layer][neuron][prevNeuron];
                }
                output[layer][neuron] = sigmoid(sum);
                output_derivative[layer][neuron] = (output[layer][neuron]* (1-output[layer][neuron]));
            }
        }
        return output[NETWORK_SIZE-1];
    }
    
    public void train(double[] input, double[] target, double eta)
    {
        if(input.length != INPUT_SIZE || target.length != OUTPUT_SIZE) return;
        calculate(input);
        backpropError(target);
        updateWeights(eta);
    }
    
    public void backpropError(double[] target)
    {
        for(int neuron = 0; neuron < NETWORK_LAYER_SIZES[NETWORK_SIZE-1]; neuron++)
        {
            error_signal[NETWORK_SIZE-1][neuron] = (output[NETWORK_SIZE-1][neuron]-target[neuron]) 
                    * output_derivative[NETWORK_SIZE-1][neuron];
        }
        for (int layer = NETWORK_SIZE-2; layer > 0; layer--) {
            for (int neuron = 0; neuron< NETWORK_LAYER_SIZES[layer]; neuron++) {
                double sum = 0;
                for (int nextNeuron = 0; nextNeuron < NETWORK_LAYER_SIZES[layer+1]; nextNeuron++) {
                    sum+= weights[layer+1][nextNeuron][neuron] * error_signal[layer+1][nextNeuron];
                }
                this.error_signal[layer][neuron] = sum* output_derivative[layer][neuron];
            }
        }
    }
    
  public void updateWeights(double eta) {
        for(int layer = 1; layer < NETWORK_SIZE; layer++) {
            for(int neuron = 0; neuron < NETWORK_LAYER_SIZES[layer]; neuron++) {

                double delta = - eta * error_signal[layer][neuron];
                bias[layer][neuron] += delta;

                for(int prevNeuron = 0; prevNeuron < NETWORK_LAYER_SIZES[layer-1]; prevNeuron ++) {
                    weights[layer][neuron][prevNeuron] += delta * output[layer-1][prevNeuron];
                }
            }
        }
    }
    
    private double sigmoid(double x)
    {
        return 1d/(1+Math.exp(-x));
    } 
}
