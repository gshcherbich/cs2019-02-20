package by.it.shcherbich.jd1.lesson02;

import java.util.Scanner;

/*
Имеется целое число, вводимое пользователем с консоли.
Это число -сумма денег в рублях.
Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").a.
Использовать конструкцию if-else.
 */
public class task2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i % 10 == 0 || (i % 10 >= 5)) {
            System.out.println(i + " рублей");
        } else if (i >= 11 && i <= 14) {
            System.out.println(i + " рублей");
        } else if (i % 100 >= 11 && i % 100 <= 19) {
            System.out.println(i + " рублей");
        } else if (i % 10 == 2 || i % 10 == 3 || i % 10 == 4) {
            System.out.println(i + " рубля");
        } else System.out.println(i + " рубль");
    }
}

