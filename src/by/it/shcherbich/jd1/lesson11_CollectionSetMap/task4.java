package by.it.shcherbich.jd1.lesson11_CollectionSetMap;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/*
4. Реализовать структуру «Черный ящик» хранящую целые числа.
Структура должна поддерживать операции добавления числа и возвращение К-го по минимальности числа
и N-ного по максимальности элемента из ящика.
 */
public class task4 {
    public static void main(String[] args) {
        TreeSet<Integer> blackBox = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        printMenu();
        int i = sc.nextInt();
        while (i != 0) {
            if (i == 1) {
                System.out.println("В черный ящик будет добавлено 5 чисел:");
                blackBox.add(sc.nextInt());
                blackBox.add(sc.nextInt());
                blackBox.add(sc.nextInt());
                blackBox.add(sc.nextInt());
                blackBox.add(sc.nextInt());
                printMenu();
            }
            if (i == 2) {
                System.out.println("Введите K-мин и N-мах:");
                int min = sc.nextInt();
                int max = sc.nextInt();
                if (min > blackBox.size() || max > blackBox.size()) {
                    System.out.println("Размер черного ящика меньше введенных значений");
                } else {
                    ArrayList<Integer> arr = new ArrayList<>(blackBox);
                    System.out.println("K-мин = " + arr.get(min-1));
                    System.out.println("N-мах = " + arr.get(arr.size() - max));
                }
                printMenu();
            }
            if (i == 3) {
                System.out.println(blackBox);
                printMenu();
            }
            i = sc.nextInt();
        }
    }
    private static void printMenu() {
        System.out.println("0 = выход");
        System.out.println("1 = добавить числа в черный ящик");
        System.out.println("2 = получение К-го по минимальности числа и N-ного по максимальности элемента");
        System.out.println("3 = вывести список элементов черного ящика");
    }
}
