package food.delivery;

public class DeliveryGuy extends User {

    private boolean Availability;

    public void acceptRequest() {

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
