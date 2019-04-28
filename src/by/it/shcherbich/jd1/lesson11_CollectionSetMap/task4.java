package by.it.shcherbich.jd1.lesson11_CollectionSetMap;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/*
4. ����������� ��������� ������� ���� �������� ����� �����.
��������� ������ ������������ �������� ���������� ����� � ����������� �-�� �� ������������� �����
� N-���� �� �������������� �������� �� �����.
 */
public class task4 {
    public static void main(String[] args) {
        TreeSet<Integer> blackBox = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        printMenu();
        int i = sc.nextInt();
        while (i != 0) {
            if (i == 1) {
                System.out.println("� ������ ���� ����� ��������� 5 �����:");
                blackBox.add(sc.nextInt());
                blackBox.add(sc.nextInt());
                blackBox.add(sc.nextInt());
                blackBox.add(sc.nextInt());
                blackBox.add(sc.nextInt());
                printMenu();
            }
            if (i == 2) {
                System.out.println("������� K-��� � N-���:");
                int min = sc.nextInt();
                int max = sc.nextInt();
                if (min > blackBox.size() || max > blackBox.size()) {
                    System.out.println("������ ������� ����� ������ ��������� ��������");
                } else {
                    ArrayList<Integer> arr = new ArrayList<>(blackBox);
                    System.out.println("K-��� = " + arr.get(min-1));
                    System.out.println("N-��� = " + arr.get(arr.size() - max));
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
        System.out.println("0 = �����");
        System.out.println("1 = �������� ����� � ������ ����");
        System.out.println("2 = ��������� �-�� �� ������������� ����� � N-���� �� �������������� ��������");
        System.out.println("3 = ������� ������ ��������� ������� �����");
    }
}
