package by.it.shcherbich.jd1.lesson03;

/*
Создать двухмерный квадратный массив, и заполнить его
"бабочкой", т.е. таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
Вывести его на экран, заменив 1 символом *, а 0-пробелом.
 */
public class task5 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((j >= i) && (j < (arr.length - i))) {
                    arr[i][j] = 1;
                }
            }
        }
        if (arr.length % 2 == 0) {
            for (int i = arr.length - 1; i >= arr.length / 2; i--) {
                for (int j = 0; j < arr.length; j++) {
                    if ((j >= (arr.length - 1 - i) && (j <= i))) {
                        arr[i][j] = 1;
                    }
                }
            }
        } else {
            for (int i = arr.length - 1; i >= arr.length / 2 + 1; i--) {
                for (int j = 0; j < arr.length; j++) {
                    if ((j >= (arr.length - 1 - i) && (j <= i))) {
                        arr[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
