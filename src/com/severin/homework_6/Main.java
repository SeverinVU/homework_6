package com.severin.homework_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Serega");
        Cat cat2 = new Cat("Ivan");

        Dog dog1 = new Dog("Petr");
        Dog dog2 = new Dog("Grisha");

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.3);

        System.out.println();

        cat1.run(1700);
        cat1.swim(5);
        cat1.jump(1.7);
    }
}
