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
    int index=0;
    private String choice;

    @Override
    public void profile() {
        System.out.println("Welcome customer " + this.getUsername());
        operation = new ShowMenu();
        operation.execute();
        ordering();
    }

    public void ordering() {
        boolean ordering = true;
        while (ordering) {
            System.out.println("Select dish to add to cart");
            index = cin.nextInt();
            operation = new AddToCart(index);
            index++;
            operation.execute();
            System.out.println("Press r to remove from cart");
            System.out.println("Press c to checkout");
            System.out.println("Press a to continue adding");
            choice = cin.next();
            if (choice.compareTo("c") == 0) {
                operation = new Checkout();
                operation.execute();
                ordering = false;
            } else if (choice.compareTo("r") == 0) {
                System.out.println("Select dish to be removed");
                index = cin.nextInt();
                operation = new RemoveFromCart(index);
                break;
            }
        }
    }

}
