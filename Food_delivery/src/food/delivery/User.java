/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.delivery;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public abstract class User {
    private String username,password,location;
    private int ID;

    User() {
    }
    
    public abstract void profile();

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
 
    public String getLocation() {
        return location;
    }

    public int getID() {
        return ID;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
