package by.it.shcherbich.jd1.lesson03;
/*
Написать метод equals, который определяет, равны ли между собой
соответствующие элементы 2-х двумерных массивов.
 */

import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[5][5];
        Random rand = new Random();
        randomArray(arr1, rand);
        randomArray(arr2, rand);
        printArray(arr1);
        System.out.println();
        printArray(arr2);
        boolean eqArr = equalsArrayElements(arr1, arr2);
        System.out.println("Все соответствующие элементы двух двумерных массивов равны:" + eqArr);
    }

    private static boolean equalsArrayElements(int[][] arr1, int[][] arr2) {
        boolean eqArr = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i][j] == arr2[i][j]) {
                    eqArr = true;
                } else {
                    eqArr = false;
                    break;
                }
            }
        }
        return eqArr;
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void randomArray(int[][] arr, Random rand) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = rand.nextInt(1);
            }
        }
    }
}
