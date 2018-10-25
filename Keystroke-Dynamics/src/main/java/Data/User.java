/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import MachineLearning.Network;
import java.util.ArrayList;

/**
 *
 * @author Annamari
 */
public class User {
    private String email;
    private ArrayList<Typing> typings;
    private Network network;

    public User(String name,  Network network) {
        this.email = name;
        this.typings = typings;
        this.network = network;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Typing> getTypings() {
        return typings;
    }

    public Network getNetwork() {
        return network;
    }
    
    
}
