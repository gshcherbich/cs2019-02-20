package by.it.shcherbich.jd1.lesson03;

import java.util.Random;

/*
Создать массив из 3 случайных целых чисел из отрезка [10;99], вывести его на экран в строку.
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class task4 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(90) + 10;
            System.out.print(arr[i] + " ");
        }
        boolean checkIncreasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] > arr[i]) {
            } else {
                checkIncreasing = false;
                System.out.println("Массив не является строго возрастающей последовательностью");
                break;
            }
        }
        if (checkIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        }
    }
}
