package by.it.shcherbich.jd1.lesson03;

import java.util.Scanner;

/*
Написать алгоритм расчета факториала , используя циклы (for и while).
 */
public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum = 1;
        if (i >= 0) {
            for (int j = 1; j <= i; j++) {
                sum = sum * j;
            }
            System.out.println(i + "!=" + sum);
        } else if (i < 0) {
            System.out.println("Факториал — функция, определённая на множестве неотрицательных целых чисел");
        }
    }
}
