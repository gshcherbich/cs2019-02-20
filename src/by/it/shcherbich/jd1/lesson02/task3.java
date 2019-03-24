package by.it.shcherbich.jd1.lesson02;

import java.util.Scanner;

/*
Написать программу, которая считывает год, введённый пользователем, и определяет, является ли этот год високосным.
Год считается високосным, если он делится без остатка на 4.
Однако, если год такжеделится на 100, то этот год невисокосный, за исключением годов, делящихся на 400.
Например:
1992 -високосный
1900 -не високосный
2000 -високосный
 */
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        boolean a = i % 4 == 0;
        boolean b = i % 100 == 0;
        boolean c = i % 400 == 0;
        if (!a) System.out.println("год не высокосный");
        else {
            if (b != c) System.out.println("год не высокосный");
            else System.out.println("год высокосный");
        }
    }
}