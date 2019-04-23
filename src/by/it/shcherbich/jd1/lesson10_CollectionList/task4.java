package by.it.shcherbich.jd1.lesson10_CollectionList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
4.	Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
•	Задать размер стека.
•	Внести цифру в стек.
•	Извлечь цифру из стека.
Вывести число, у которого цифры идут в обратном порядке.
 */
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new LinkedList<>();
        printMenu();
        byte i = sc.nextByte();
        while (i != 0) {
            if (i == 2) {
                System.out.println("Введите цифру, которая будет добавлена в стек");
                i = sc.nextByte();
                ls.add((int) i);
                i = sc.nextByte();
            } else if (i == 3) {
                System.out.println("Извлеченная из стека цифра = " + ls.get(ls.size() - 1));
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
        System.out.println("Меню:");
        System.out.println("1. Задайте размер стека");
        System.out.println("2. Ввод цифры в стек");
        System.out.println("3. Извлечение цифру из стека");
        System.out.println("4. Извлечение числа в обратном порядке");
        System.out.println("0. Выход");
    }
}

