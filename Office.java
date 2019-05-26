public class Office extends Product {
    private double cpuSpeed;
    private int ram, storage;
    private boolean ssd;

    public Office (double p, int q, double c, int r, boolean s, int sA) {
        super(p, q);
        cpuSpeed = c;
        ram = r;
        ssd = s;
        storage = sA;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public int getRam() {
        return ram;
    }

    public boolean aSsd() {
        return ssd;
    }

    public int getStorage() {
        return storage;
    }
}