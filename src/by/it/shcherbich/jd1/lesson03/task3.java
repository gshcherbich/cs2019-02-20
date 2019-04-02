package by.it.shcherbich.jd1.lesson03;

/*
Определить сумму элементов целочисленного массива, расположенных между ближайшими
минимальным и максимальным значениями, не включая минимальное и максимальное значение
0 2 3 9 -> 2+3=5
0 2 3 9 1 1 1 0 1 2 9 -> 2+3+1+2=8
0 2 9 8 0 4 9 -> 2+4=6
 */
public class task3 {
    public static void main(String[] args) {
        int[] arr = {9, 1, 0};
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        int lastmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                lastmax = i;
            }
        }
        for (int i = 0; i < lastmax; i++) {
            if (arr[i] == min && arr[i + 1] != max) {
                while (arr[i + 1] != max) {
                    sum += arr[i + 1];
                    i++;
                }
            }
        }
        System.out.println("Минимальное значение массива=" + min);
        System.out.println("Максимальное значение массива=" + max);
        System.out.println("Номер последнего максимального элемента массива=" + lastmax);
        System.out.println("Сумма значений элементов между минимальными и максимальными значениями=" + sum);

    }
}
