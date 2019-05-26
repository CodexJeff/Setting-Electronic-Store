public class Fridge extends Kitchen {
    private double cubicFeet;
    private boolean hasFreezer;

    public Fridge(double p, int q, int w, String c, String b, double a, boolean f) {
        super(p, q, w, c, b);
        cubicFeet = a;
        hasFreezer = f;
    }

    public String toString() {
        if (!hasFreezer) {
            return cubicFeet + " cu. ft. " + getBrand() + " Fridge " + "(" + getColor() + ", " + getWattage() + " watts) " + " (" + getQuantity() + " in stock, " + getPrice() + " dollars each" + ")";
        }
        return cubicFeet + " cu. ft. " + getBrand() + " Fridge with Freezer " + "(" + getColor() + ", " + getWattage() + " watts) " + " (" + getQuantity() + " in stock, " + getPrice() + " dollars each" + ")";
    }
}