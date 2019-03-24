package by.it.shcherbich.jd1.lesson02;

import java.util.Scanner;

/*
Имеется целое число, вводимое пользователем с консоли.
Это число -сумма денег в рублях.
Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").a.
Использовать switch.
 */
public class task2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i % 100) {
            case 11:
                System.out.println(i + " рублей");
                break;
            case 12:
                System.out.println(i + " рублей");
                break;
            case 13:
                System.out.println(i + " рублей");
                break;
            case 14:
                System.out.println(i + " рублей");
                break;
            default: {
                switch (i % 10) {
                    case 0:
                        System.out.println(i + " рублей");
                        break;
                    case 1:
                        System.out.println(i + " рубль");
                        break;
                    case 2:
                        System.out.println(i + " рубля");
                        break;
                    case 3:
                        System.out.println(i + " рубля");
                        break;
                    case 4:
                        System.out.println(i + " рубля");
                        break;
                    case 5:
                        System.out.println(i + " рублей");
                        break;
                    case 6:
                        System.out.println(i + " рублей");
                        break;
                    case 7:
                        System.out.println(i + " рублей");
                        break;
                    case 8:
                        System.out.println(i + " рублей");
                        break;
                    case 9:
                        System.out.println(i + " рублей");
                        break;
                }
            }
        }
    }
}
