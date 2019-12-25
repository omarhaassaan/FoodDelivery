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
public class Customer extends User {

    private CustomerOperation operation;
    private Scanner cin = new Scanner(System.in);
    int index;
    String choice;

    @Override
    public void profile() {
        System.out.println("Welcome customer " + this.getUsername());
        operation = new ShowMenu();
        operation.execute();
        ordering();
    }

    public void ordering() {
        while (true) {
            System.out.println("Select dish to add to cart");
            index = cin.nextInt();
            operation = new AddToCart(index);
            System.out.println("Press r to remove from cart");
            System.out.println("Press c to checkout");
            System.out.println("Press a to continue adding");
            choice = cin.next();
            if (choice == "c") {
                operation = new Checkout();
                operation.execute();
                break;
            } else if (choice == "r") {
                System.out.println("Select dish to be removed");
                index = cin.nextInt();
                operation = new RemoveFromCart(index);
                break;
            }
        }
    }

}
