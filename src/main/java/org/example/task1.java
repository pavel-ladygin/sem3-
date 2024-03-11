package org.example;

public class task1 {
    public static void main(String[] args) {
        tochka a = new tochka(6, 15);
        tochka b = new tochka(10, 20);
        System.out.println(a.distanseTo(a, b));
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}