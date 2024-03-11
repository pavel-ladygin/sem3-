package org.example;

public class task2 {
    public static void main(String[] args) {
        double[] xy1 = {4, 9};
        double[] xy2 = {-3, 6};
        Vector vector1 = new Vector(xy1);
        Vector vector2 = new Vector(xy2);
        System.out.println("Векторо 1: " + vector1);
        System.out.println("Вектор 2: " + vector2);
        System.out.println("Скалярное произведене : " + vector1.Scalar(vector2));
        System.out.println("Сумма : " + vector1.sum(vector2));
        System.out.println("Разность : " + vector1.raznost(vector2));
        System.out.println("Умножение на число: " + vector1.Proiz(10));
        System.out.println("Угол между векторами: " + vector1.ygol(vector2));
        System.out.println("Длина  вектора1: " + vector1.lenght());
        System.out.println("Площадь паралелограмма: " + vector1.S_Parallelogram(vector2));
    }
}



