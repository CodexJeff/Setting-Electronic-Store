public class Laptop extends Office {
    private double screenSize;

    public Laptop(double p, int q, double c, int r, boolean s, int sA, double sS) {
        super(p, q, c, r, s, sA);
        screenSize = sS;
    }

    public String toString() {
        if (!aSsd()) {
            return screenSize + " Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB HDD drive. " + "(" + getQuantity() + " in stock, " + getPrice() + " dollars each)";
        }
        return screenSize + " Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB SSD drive. " + "(" + getQuantity() + " in stock, " + getPrice() + " dollars each)";
    }
}