/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */ package food.delivery;

import java.util.ArrayList;

/**
 * * * @author Lenovo
 */
public class Database {

    private int currentID;
    private static Database instance = new Database();
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<Dish> dishes = new ArrayList();
    ArrayList<Feedback> feedbacks = new ArrayList();

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    public void addUser(User u) {
        this.users.add(u);
    }

    public void removeUser(User u) {
        this.users.remove(u);
    }

    public void addDish(Dish d) {
        this.dishes.add(d);
    }

    public void removeDish(Dish d) {
        this.dishes.remove(d);
    }

    public void addFeedback(Feedback fb) {
        this.feedbacks.add(fb);
    }

    public void removeFeedback(Feedback fb) {
        this.feedbacks.remove(fb);
    }
    public void setCurrentID(int currentID){
        this.currentID = currentID;
    }
    public int getCurrentID(){
        return this.currentID;
    }

//    public ArrayList<Dish> getDishes() {
//        return dishes;
//    }
    
}
