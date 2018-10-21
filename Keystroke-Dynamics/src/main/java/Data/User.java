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
public class User {
    private String password;
    private ArrayList<Typing> typings;

    public User(String password, ArrayList<Typing> typings) {
        this.password = password;
        this.typings = typings;
    }
}
