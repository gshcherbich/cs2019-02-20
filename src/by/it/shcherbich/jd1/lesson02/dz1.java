package by.it.shcherbich.jd1.lesson02;

import java.util.Scanner;

/*
 Имеются три числа -день, месяц и год, вводимые пользователем с консоли.
 Вывести дату следующегодня в формате"День.Месяц.Год".
 Учесть переход на следующий месяц, а также следующий год.
 Форматирование строки"День.Месяц.Год"вынести в отдельную функцию.
 */
public class dz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if (checkValidDate(day, month, year)) {
            day++;
            if (checkValidDate(day, month, year)) ;
            else {
                day = 1;
                if (month == 12) {
                    month = 1;
                    year++;
                } else month++;
            }
            print(day, month, year);
        } else System.out.println("Введенная дата не реальна");

    }

    private static boolean checkValidDate(int day, int month, int year) {
        boolean valid;
        if (year >= 0 && month >= 1 && month <= 12 && day > 0) {
            if (day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
                valid = true;
            } else if (day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
                valid = true;
            } else if (checkYear(year) == true && day <= 29) {
                valid = true;
            } else if (checkYear(year) == false && day <= 28) {
                valid = true;
            } else valid = false;
        } else valid = false;
        return valid;
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

    private static void print(int day, int month, int year) {
        System.out.println(day + "." + month + "." + year);
    }
}


