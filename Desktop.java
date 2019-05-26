public class Desktop extends Office {
    private String profile;

    public Desktop(double p, int q, double c, int r, boolean s, int sA, String pF) {
        super(p, q, c, r, s, sA);
        profile = pF;
    }

    public String toString() {
        if (!aSsd()) {
            return profile + " Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB HDD drive. " + "(" + getQuantity() + " in stock, " + getPrice() + " dollars each)";
        }
        return profile + " Desktop PC with " + getCpuSpeed() + "ghz CPU, " + getRam() + "GB RAM, " + getStorage() + "GB SSD drive. " + "(" + getQuantity() + " in stock, " + getPrice() + " dollars each)";
    }
}