package by.it.shcherbich.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n*n).
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] m = new int[20];
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }
        sort(m);
    }


    public static void sort(int[] array) {
        //Напишите тут ваш код
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);

        }
    }

}
