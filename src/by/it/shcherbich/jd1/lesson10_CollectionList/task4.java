package by.it.shcherbich.jd1.lesson10_CollectionList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
4.	������ � ������� �����, ������� ��� ����� � ����. ���� � �������������� ���������������� �����, �������������� 3 ��������:
�	������ ������ �����.
�	������ ����� � ����.
�	������� ����� �� �����.
������� �����, � �������� ����� ���� � �������� �������.
 */
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new LinkedList<>();
        printMenu();
        byte i = sc.nextByte();
        while (i != 0) {
            if (i == 2) {
                System.out.println("������� �����, ������� ����� ��������� � ����");
                i = sc.nextByte();
                ls.add((int) i);
                i = sc.nextByte();
            } else if (i == 3) {
                System.out.println("����������� �� ����� ����� = " + ls.get(ls.size() - 1));
                ls.remove(ls.size() - 1);
                i = sc.nextByte();
            } else if (i == 4) {
                while (!ls.isEmpty()) {
                    System.out.print(ls.get(ls.size() - 1));
                    ls.remove(ls.size() - 1);
                }
                i = sc.nextByte();
            } else i = sc.nextByte();
        }
    }
    private static void printMenu() {
        System.out.println("����:");
        System.out.println("1. ������� ������ �����");
        System.out.println("2. ���� ����� � ����");
        System.out.println("3. ���������� ����� �� �����");
        System.out.println("4. ���������� ����� � �������� �������");
        System.out.println("0. �����");
    }
}

