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
        boolean isSimply = true;
        if (i >= 2) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimply = false;
                    break;
                }
            }
        } else {
            isSimply = false;
        }
        if (isSimply) {
            System.out.println("Введенное число является простым");
        } else {
            System.out.println("Введенное число не является простым");
        }
    }
}
