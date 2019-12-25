/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.delivery;

import food.delivery.Form;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Login extends Form {

    private Scanner cin = new Scanner(System.in);

    Login() {
        form();
    }

    @Override
    public void getInfo() {
        System.out.println(" ***************   Login Form *****************");
        System.out.println("Enter username");
        setUsername(cin.next());
        System.out.println("Enter password");
        setPassword(cin.next());
    }

    @Override
    public boolean commWithDb() {
        Database db = Database.getInstance();
        for (int i = 0; i < db.users.size(); i++) {
            if (db.users.get(1).getUsername() == getUsername() && db.users.get(1).getPassword()== getPassword()) {
                return true;
            }
        }
        return false;
    }
}
