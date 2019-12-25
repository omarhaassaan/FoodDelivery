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
public class FoodDelivery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Press 1 to sign up, press 2 to sign in");
        if (cin.nextInt() == 1) {
            Registration reg = new Registration();
        } else if (cin.nextInt() == 2) {
            Login log = new Login();
        }
    }

}
