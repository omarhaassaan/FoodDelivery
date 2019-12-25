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

public class Database {
    private  static Database instance = null;
    ArrayList<User> users = new ArrayList();
    ArrayList<Dish> dishes = new ArrayList();
    ArrayList<Feedback> feedbacks = new ArrayList();
    
    private Database (){
        
    }
    public static Database getInstance(){
        if(instance == null)
            instance = new Database();
        return instance;
    }
    
}
