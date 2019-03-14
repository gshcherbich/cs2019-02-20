package by.it.shcherbich.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list1.add(0, sc.nextInt());
        }
        ArrayList<Integer> listmod3 = new ArrayList<>();
        ArrayList<Integer> listmod2 = new ArrayList<>();
        ArrayList<Integer> listmod0 = new ArrayList<>();
        for (Integer integer : list1) {
            if (integer % 3 == 0) listmod3.add(0, integer);
            if (integer % 2 == 0) listmod2.add(0, integer);
            if (integer % 2 != 0 && integer % 3 != 0) listmod0.add(0, integer);
        }
        printList(listmod3);
        printList(listmod2);
        printList(listmod0);

    }

    private static void printList(List<Integer> list) {
        for (Integer aList : list) System.out.println(aList);
    }


}
