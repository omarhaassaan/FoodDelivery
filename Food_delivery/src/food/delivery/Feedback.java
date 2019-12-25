/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */ package food.delivery;

import java.util.Scanner;

/**
 * * * @author omarh
 */
public class Feedback {

    private int rate;
    private int chefID;
    Scanner sc = new Scanner(System.in);

    public void setFeedback() {
        System.out.println("Enter the ID of the Chef you want to rate:");
        this.chefID = sc.nextInt();
        System.out.println("Enter the rate from 1 to 5:");
        this.rate = sc.nextInt();
        Database.getInstance().addFeedback(this);
    }

    public int getRate() {
        return rate;
    }

    public int getChefID() {
        return chefID;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setChefID(int chefID) {
        this.chefID = chefID;
    }
}
