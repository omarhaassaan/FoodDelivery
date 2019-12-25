package food.delivery;

import java.util.ArrayList;

public class OrderManager {

    private static OrderManager instance = new OrderManager();
    ArrayList<Order> orders = new ArrayList();
    ArrayList<Order> finishedorders = new ArrayList();

    private OrderManager() {
    }

    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    public void AssignDishes(Order o) {
        ArrayList<Dish> dishes = o.getDishes();
        for (int i = 0; i < dishes.size(); i++) {
            Dish dish = dishes.get(i);
            Chef cf = ((Chef) Database.getInstance().users.get(dish.getChefID() - 1));
            cf.makeDish(dish);
        }
    }

    public void requestDeliveryGuy(Order o) {
        ArrayList users = Database.getInstance().users;
        int i;
        for (i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof DeliveryGuy) {
                DeliveryGuy dg = ((DeliveryGuy) users.get(i));
                if (dg.isAvailability()) {
//Pass order o to delivery guy dg 
                    dg.acceptRequest(o);
                    this.removeOrder(o);
                    break;
                }
            }
        }
        if(i==users.size()){
            System.out.println("No Delivery Guys available now ");
        }
    }

    public void checkFinishing() {
        for (int i = 0; i < orders.size(); i++) {
            ArrayList<Dish> d = orders.get(i).getDishes();
            int x = 0;
            int j;
            for (j = 0; j < d.size(); j++) {
                if (d.get(j).isFinished()) {
                    x++;
                }
            }
            if(x==j){
                this.requestDeliveryGuy(this.orders.get(i));
                this.finishedorders.add(this.orders.get(i));
                this.orders.remove(i);
            }
        }
    }

    public void addFinishedOrder(Order o) {
        this.finishedorders.add(o);
        this.requestDeliveryGuy(o);
    }

    public void addOrder(Order o) {
        this.orders.add(o);
        o.pay();
        this.AssignDishes(o);
    }

    public void removeOrder(Order o) {
        this.orders.remove(o);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

}
