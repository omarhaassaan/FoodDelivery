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
        boolean s = true;
        while (s) {
            System.out.println("Press 1 to sign up, press 2 to sign in");
            int choice = cin.nextInt();
            if (choice == 1) {
                Registration reg = new Registration();
            } else if (choice == 2) {
                Login log = new Login();
            }
        }
    }

}
