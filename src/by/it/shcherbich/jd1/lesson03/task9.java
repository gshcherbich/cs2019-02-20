package by.it.shcherbich.jd1.lesson03;

import java.util.Scanner;

/*
Имеется целое число, определить является ли это число простым,
т.е. делится без остатка только на 1 и себя.
 */
public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = 2;
        if (i > 2) {
            while (j < i) {
                if (i % j == 0) {
                    System.out.println("Введенное число не является простым");
                    break;
                } else {
                    j++;
                    System.out.println("Введенное число является простым");
                    break;
                }
            }
        } else if (i == 2) {
            System.out.println("Введенное число является простым");
        } else
            System.out.println("Введенное число не является простым");
    }
}
