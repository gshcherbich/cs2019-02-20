package by.it.shcherbich.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] m = new int[10];
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }
        int temp, one, last;
        one = m[0];
        last = m[m.length - 1];
        for (int i = 1; i < m.length; i++) {
            for (int j = m.length - 1; j >= i; j--) {
                if (m[j - 1] > m[j]) {
                    temp = m[j - 1];
                    m[j - 1] = m[j];
                    m[j] = temp;
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            if (m[i] == one) System.out.println("Index of first element=" + i);
            if (m[i] == last) System.out.println("Index of last element=" + i);

        }
    }
}
