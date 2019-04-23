package by.it.shcherbich.jd1.lesson10_CollectionList;

import java.util.*;

/*
1.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
2.	Задание. Найти самую высокую оценку с использованием итератора.
3.	Вывести учеников из списка в обратном порядке. (2 варианта решения).
 */
public class task123 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Student> journalScore = new ArrayList<Student>();
        journalScore.add(new Student("Саша", random.nextInt(5) + 1));
        journalScore.add(new Student("Маша", random.nextInt(5) + 1));
        journalScore.add(new Student("Паша", random.nextInt(5) + 1));
        journalScore.add(new Student("Даша", random.nextInt(5) + 1));
        journalScore.add(new Student("Ириша", random.nextInt(5) + 1));
        Iterator<Student> iter = journalScore.listIterator();
        System.out.println("Все ученики и их оценки:\n"+journalScore);
        System.out.println("Способ обратной сортировки №1:");
        for (int i = journalScore.size()-1; i >=0; i--) {
            System.out.println(journalScore.get(i));
        }
        Collections.reverse(journalScore);
        System.out.println("Способ обратной сортировки №2:\n"+journalScore);
        int max=0;
        while (iter.hasNext()) {
            Integer i = iter.next().score;
            if (i>max){
                max=i;
            }
            if (i<=2){
                iter.remove();
            }
        }
        System.out.println("Ученики с удовлетворительными оценками:\n"+journalScore);
        System.out.println("Максимальная оценка = "+max);
    }
}
