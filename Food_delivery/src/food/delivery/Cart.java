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
public class Cart {

    private ArrayList<Dish> dishes = new ArrayList();

    public void add(int index) {
        Database db = Database.getInstance();
        dishes.add(db.getDishes().get(index));
    }

    public void remove(int index) {
        Database db = Database.getInstance();
        dishes.remove(db.getDishes().get(index));
    }

    public void checkout() {
        Order o = new Order();
        o.setDishes(dishes);
        OrderManager.getInstance().addOrder(o);
    }
}
