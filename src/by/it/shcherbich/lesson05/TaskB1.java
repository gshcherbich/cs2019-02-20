package by.it.shcherbich.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0, "первая строка");
        list.add(1, "вторая строка");
        list.add(2, "третяя строка");
        list.add(3, "четвертая строка");
        list.add(4, "пятая строка");
        int n = list.size();
        System.out.println(n);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
