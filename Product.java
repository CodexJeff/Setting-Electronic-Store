public abstract class Product {
    private double price;
    private int quantity;

    public Product(double p, int q) {
        price = p;
        quantity = q;
    }

    public Product() {
        //the default because there is none
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int set_quantity) {
        quantity = set_quantity;
    }

    public double getPrice() {
        return price;
    }

    public void sellUnits(int amount) {
        if (amount >= quantity) {
            quantity -= amount;

        } else{
            quantity = amount;
        }
    }
}