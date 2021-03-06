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
public class Chef extends User {
    private boolean availability;
    private ArrayList offerDish = new ArrayList();
    private ArrayList opDish = new ArrayList();
    Chef(){
        
    }
    
    @Override
    public void profile(){
       System.out.println("Welcome chef "+this.getUsername());
       Dish d = new Dish();
       offerDish(d);
    }
    public void offerDish(Dish dish){
        offerDish.add(dish);
        Database db = Database.getInstance();
        db.addDish(dish);
    }
    
    public void makeDish (Dish dish){
        opDish.add(dish);
        this.finishDish(dish);
    }
    
    public void finishDish(Dish dish){
        opDish.remove(opDish.indexOf(dish));
        dish.setFinished(true);
        OrderManager.getInstance().checkFinishing();
        System.out.println("Dish "+ dish.getName() + " Finished and ready");
        
    }
}
