package by.it.shcherbich.jd1.lesson13_Strings;

import org.apache.log4j.Logger;

import java.util.Scanner;

/*
7. Написать функцию, принимающую на вход целое число, возвращающую строку из 7 символов, дополненных слева нулями.
Если число выходит за размер 7 символов вернуть все нули.
Пример getString(22) -> 0000022
Найти 3 способа решения задачи и определить наиболее быстрый способ.
 */
public class task7 {
    public static final Logger LOGGER = Logger.getLogger(task7.class);

    public static void main(String[] args) {
        long start;
        long finish;
        Scanner sc = new Scanner(System.in);
        int i;
        try {
            i = sc.nextInt();
        } catch (Exception ex) {
            LOGGER.trace("Некорректный ввод, повторно введите целое число", ex);
            sc = new Scanner(System.in);
            i = sc.nextInt();
        }
        start = System.nanoTime();
        System.out.println(getString3(i));
        finish = System.nanoTime();
        System.out.println("Время выполнения конкотинации строк = " + (finish - start) + " наносек.");
        start = System.nanoTime();
        System.out.println(getString2(i));
        finish = System.nanoTime();
        System.out.println("Время выполнения сложения строк = " + (finish - start) + " наносек.");
        start = System.nanoTime();
        System.out.println(getString1(i));
        finish = System.nanoTime();
        System.out.println("Время выполнения StringBuilder = " + (finish - start) + " наносек.");
        start = System.nanoTime();
        System.out.println(getString4(i));
        finish = System.nanoTime();
        System.out.println("Время выполнения format = " + (finish - start) + " наносек.");
        start = System.nanoTime();
        System.out.println(getString5(i));
        finish = System.nanoTime();
        System.out.println("Время выполнения 5 вариант = " + (finish - start) + " наносек.");
    }

    static StringBuilder getString1(int i) {
        StringBuilder str = new StringBuilder();
        str = str.append(i);
        if (str.length() > 7) {
            str.setLength(0);
            str.append("0000000");

        } else {
            while (str.length() != 7) {
                //str.insert(0, "0");
                str.append(0);
            }
        }
        return str;
    }

    static String getString2(int i) {
        String str = "" + i;
        if (str.length() > 7) {
            str = "0000000";
        } else {
            while (str.length() != 7) {
                str = "0" + str;
            }
        }
        return str;
    }

    static String getString3(int i) {
        String str = "" + i;
        if (str.length() > 7) {
            str = "0000000";
        } else {
            while (str.length() != 7) {
                str = "0".concat(str);
            }
        }
        return str;
    }

    static String getString4(int i) {
        return String.format("%07d", i);
    }

    static String getString5(int i) {
        String str;
        i = i + 10000000;
        str = Integer.toString(i).substring(1);
        return str;
    }
}