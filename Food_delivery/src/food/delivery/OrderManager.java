package food.delivery;

import java.util.ArrayList;

public class OrderManager {

    ArrayList<Order> orders = new ArrayList();
    ArrayList<Order> finishedorders = new ArrayList();

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
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) instanceof DeliveryGuy) {
                DeliveryGuy dg = ((DeliveryGuy) users.get(i));
                if (dg.isAvailability()) {
//Pass order o to delivery guy dg 
                    dg.acceptRequest();
                    this.removeOrder(o);
                }
            }
        }
    }

    public void addFinishedOrder(Order o) {
        this.finishedorders.add(o);
        this.requestDeliveryGuy(o);
    }

    public void addOrder(Order o) {
        this.orders.add(o);
    }

    public void removeOrder(Order o) {
        this.orders.remove(o);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

}
