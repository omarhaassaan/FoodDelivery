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
    private ArrayList offerDish,opDish;
    Chef(){
        
    }
    
    public void offerDish(Dish dish){
        offerDish.add(dish);
        Database db = Database.getInstance();
        db.addDish(dish);
    }
    
    public void makeDish (Dish dish){
        opDish.add(dish);
    }
    public void finishDish(Dish dish){
        opDish.remove(opDish.indexOf(dish));
    }
    
    
    
}
