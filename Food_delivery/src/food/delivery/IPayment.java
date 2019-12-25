package food.delivery;

abstract public class IPayment {
    private double amount;

    abstract void pay();
    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return this.amount;
    }
}
