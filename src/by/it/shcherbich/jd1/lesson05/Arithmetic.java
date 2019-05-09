package by.it.shcherbich.jd1.lesson05;

import java.math.BigDecimal;
import java.math.RoundingMode;
/*
Определить класс, который при инициализации принимает на вход 2 аргумента целого или вещественного типа.
Задать переопределенные методы возвращающие результат арифметических операций над
заданными полями и полями типа BigDecimal.
 */

public class Arithmetic {

    BigDecimal bd1;
    BigDecimal bd2;

    public Arithmetic(int a, int b) {
        print(add(a, b));
    }

    public Arithmetic(double a, double b) {
        print(add(a, b));
        bd1 = new BigDecimal(a);
        bd2 = new BigDecimal(b);
        System.out.println(bd1.add(bd2).setScale(2, RoundingMode.CEILING));
    }

    public Arithmetic(int a, double b) {
        print(add(b, a));
    }

    public Arithmetic(double a, int b) {
        print(add(a, b));
    }

    private int add(int a, int b) {
        return a + b;
    }

    private double add(double a, double b) {
        return a + b;
    }

    private void print(int c) {
        System.out.println(c);
    }

    private void print(double c) {
        System.out.println(c);
    }
}
