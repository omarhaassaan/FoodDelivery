/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.delivery;

/**
 *
 * @author Lenovo
 */

public class Database {
    private  static Database instance = null;
    private Database (){
        
    }
    
    public static Database getInstance(){
        if(instance == null)
            instance = new Database();
        return instance;
    }
}
