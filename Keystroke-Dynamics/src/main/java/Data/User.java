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
    private String name;
    private ArrayList<Typing> typings;

    public User(String name, ArrayList<Typing> typings) {
        this.name = name;
        this.typings = typings;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Typing> getTypings() {
        return typings;
    }
}
