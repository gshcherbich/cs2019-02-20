package by.it.shcherbich.jd1.lesson03;

/*
Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.
 */
public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int k = 0;
        for (int j = 13; k < 100; j++) {
            if (j % 13 == 0 || j % 17 == 0) {
                arr[k] = j;
                k++;
            }
        }
        printArray(arr);
    }


    private static void printArray(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            System.out.println(i + ". " + arr[i - 1]);
        }
    }
}