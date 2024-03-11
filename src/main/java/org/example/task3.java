package org.example;

public class task3 {
    public static void main(String[] args) {
        Developer Java_dev = Create_Developer.createDeveloper("Владимир", "Middle", 3, "white, learn", "Java");
        Java_dev.Develop();

        Developer Python_dev = Create_Developer.createDeveloper("Дмитрий", "Juniour", 1, "sleep, go", "Python");
        Python_dev.Develop();
    }
}
