package org.example;

public class tochka {
    private double x;
    private double y;
    public tochka(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distanseTo(tochka a, tochka b) {
        double ab, x0, y0;
        x0 = Math.pow((a.x - b.y), 2);
        y0 = Math.pow((a.y - b.y), 2);
        ab = Math.sqrt(x0 + y0);
        return ab;
    }
    @Override
    public String toString() {
        return "Tochka:" + "(" + x + "," + y + ")";
    }
}
