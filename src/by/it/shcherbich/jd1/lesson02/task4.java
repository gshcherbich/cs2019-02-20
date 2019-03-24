package by.it.shcherbich.jd1.lesson02;

import java.util.Scanner;

/*
Написать программу, которая считывает число, месяц и год, введённые пользователем в виде трёх целых чисел.
Программа должна определять, является ли введённая дата реальной и выводить результат.
Использовать следующую информацию:
Январь, март, май, июль, август, октябрь, декабрь -31 день
Апрель, июнь, сентябрь, ноябрь -30 дней
Февраль -28 дней в обычный год, 29 дней в високосный
 */
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if (year >= 0 && month >= 1 && month <= 12 && day > 0) {
            if (day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
                System.out.println("Дата реальна " + day + "." + month + "." + year);
            } else if (day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                System.out.println("Дата реальна " + day + "." + month + "." + year);
            } else if (checkYear(year) == true && day <= 29) {
                System.out.println("Дата реальна " + day + "." + month + "." + year);
            } else if (checkYear(year) == false && day <= 28) {
                System.out.println("Дата реальна " + day + "." + month + "." + year);
            } else System.out.println("Дата не реальна");
        } else System.out.println("Дата не реальна");

        {

        }
    }

    private static boolean checkYear(int year) {

        boolean a = year % 4 == 0;
        boolean b = year % 100 == 0;
        boolean c = year % 400 == 0;
        boolean d = false;
        if (a) {
            if (b == c) d = true;
        }
        return d;

    }
}