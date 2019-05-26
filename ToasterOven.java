public class ToasterOven extends Kitchen {
    private int width;
    private boolean convection;

    // constructor
    public ToasterOven(double p, int q, int wA, String c, String b, int w, boolean cV) {
        super(p, q, wA, c, b);
        width = w;
        convection = cV;
    }

    public String toString() {
        if (!convection) {
            return width + " inch Toaster " + "(" + getColor() + ", " + getWattage() + " watts) " + " (" + getQuantity() + " in stock, " + getPrice() + " dollars each)";
        }
        return width + " inch Toaster with convection " + "(" + getColor() + ", " + getWattage() + " watts) " + " (" + getQuantity() + " in stock, " + getPrice() + " dollars each)";
    }
}