public class Kitchen extends Product {
    private int wattage;
    private String color, brand;

    public Kitchen (double p, int q, int w, String c, String b) {
        super(p, q);
        wattage = w;
        color = c;
        brand = b;
    }

    public int getWattage() {
        return wattage;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}