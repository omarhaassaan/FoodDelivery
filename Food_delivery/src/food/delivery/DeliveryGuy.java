package food.delivery;

public class DeliveryGuy extends User {

    private boolean Availability = true;

    public void acceptRequest(Order o) {
        System.out.println(this.getUsername() + " Got the Order of CustomerID " + Database.getInstance().getCurrentID());
        this.orderDelivered(o);
    }

    public void orderDelivered(Order o) {
        System.out.println("Order of CustomerID " + Database.getInstance().getCurrentID() + " Delivered Successfully");

    }

    @Override
    public void profile() {
        System.out.println("Welcome delivery guy " + this.getUsername());

    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }

    public boolean isAvailability() {
        return Availability;
    }

}
