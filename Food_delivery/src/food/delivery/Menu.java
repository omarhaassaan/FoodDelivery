/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.delivery;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Menu {
    private ArrayList <Dish> dishes= new ArrayList();
    public void action(){
        Database db = Database.getInstance();
        dishes =db.getDishes();
        for (int i = 0; i < dishes.size(); i++) {
            System.out.println(i + ") " + dishes.get(i).getName());
            System.out.println(dishes.get(i).getPrice());
            System.out.println("---------------------------------");
        }
    }
}
