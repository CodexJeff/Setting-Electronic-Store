public class ElectronicStore extends Product {
    private final int MAX_PRODUCTS = 10;
    private int curProducts;
    private String name;
    private Product[] stock = new Product[MAX_PRODUCTS];

    public ElectronicStore(String init_name) {
        name = init_name;
    }

    public boolean addProduct(Product p) {
        if (MAX_PRODUCTS > curProducts) {
            stock[curProducts] = p;
            curProducts++;
            return true;
        }
        else {
            return false;
        }
    }

    public void sellProducts(int item, int amount) {
        if (curProducts > item && item >= 0 && amount < stock[item].getQuantity()) {
            System.out.println();
            stock[item].sellUnits(amount);
        }
    }

    public double getRevenue() {
        double num = 0;
        for (int i = 0; i < curProducts; i++) {
            num += stock[i].getPrice();
        }
        return num;
    }

    public void printStock() {
        for (int i = 0; i < curProducts; i++) {
            System.out.println(stock[i]);
        }
    }

    public String getName() {
        return name;
    }
}