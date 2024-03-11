package org.example;
import java.util.Arrays;
public class Vector {
    private double[] xy;
    public Vector(double[] xy) {
        this.xy = xy;
    }
    public double Scalar(Vector next) {
        double result = 0;
        for (int i = 0; i < xy.length; i++) {
            result += this.xy[i] * next.xy[i];
        }
        return result;
    }
    public Vector sum(Vector next) {
        double[] result = new double[xy.length];
        for (int i = 0; i < xy.length; i++) {
            result[i] = this.xy[i] + next.xy[i];
        }            return new Vector(result);
    }
    public Vector raznost(Vector next) {
        double[] result = new double[xy.length];
        for (int i = 0; i < xy.length; i++) {
            result[i] = this.xy[i] - next.xy[i];
        }            return new Vector(result);
    }
    public Vector Proiz(double a) {
        double[] result = new double[xy.length];
        for (int i = 0; i < xy.length; i++) {
            result[i] = this.xy[i] * a;
        }            return new Vector(result);
    }
    public double ygol(Vector next) {
        double Scalar = this.Scalar(next);
        double proiz = this.lenght() * next.lenght();
        return Math.acos(Scalar / proiz);
    }
    public double lenght () {
        double sum = 0;
        for (double xy : xy) {
            sum += Math.pow(xy, 2);
        }            return Math.sqrt(sum);
    }
    public double S_Parallelogram(Vector next) {
        double ygol = this.ygol(next);
        double len = this.lenght() * next.lenght();
        return len * Math.sin(ygol);
    }
    @Override
    public String toString() {
        return "Vector{" + "xy=" + Arrays.toString(xy) + '}';
    }
}