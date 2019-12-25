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

    private String username, password, location, ID;
    Scanner cin = new Scanner(System.in);
    Login log;
    Registration reg;

    User() {
        System.out.println("Press 1 to sign up, press 2 to sign in");
        if (cin.nextInt() == 1) {
            reg = new Registration();
        } else if (cin.nextInt() == 2) {
            log = new Login();
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getLocation() {
        return location;
    }

    public String getID() {
        return ID;
    }

    public Scanner getCin() {
        return cin;
    }

    public Login getLog() {
        return log;
    }

    public Registration getReg() {
        return reg;
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

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCin(Scanner cin) {
        this.cin = cin;
    }

    public void setLog(Login log) {
        this.log = log;
    }

    public void setReg(Registration reg) {
        this.reg = reg;
    }

}
