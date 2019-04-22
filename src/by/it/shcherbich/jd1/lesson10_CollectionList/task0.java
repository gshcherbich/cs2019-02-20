package by.it.shcherbich.jd1.lesson10_CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
1.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
2.	Задание. Найти самую высокую оценку с использованием итератора.

Вопросы: как выводить в консоль по одному элементу в цикле итерирования? (выводит адреса ссылок, а не значения)
 */
public class task0 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(5) + 1);
        }
        System.out.println("Все оценки:\n"+list);
        Iterator<Integer> iter = list.iterator();
        int max=0;
        while (iter.hasNext()) {
            int i = iter.next();
            if (max<i) {
                max=i;
            }
            //System.out.println(iter);
            if (i <= 2) {
                iter.remove();
            }
        }
        System.out.println("Удовлетворительные оценки 3-5:\n"+list);
        System.out.println("Максимальная оценка = "+max);
    }
}
