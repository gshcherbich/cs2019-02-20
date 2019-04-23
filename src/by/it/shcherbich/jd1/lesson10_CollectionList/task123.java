package by.it.shcherbich.jd1.lesson10_CollectionList;

import java.util.*;

/*
1.	�������. ������� ������ ������ �������� � ������� ListIterator, ��������� ���������� ��������.
������� �������������������� ������ �� ������.
2.	�������. ����� ����� ������� ������ � �������������� ���������.
3.	������� �������� �� ������ � �������� �������. (2 �������� �������).
 */
public class task123 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Student> journalScore = new ArrayList<Student>();
        journalScore.add(new Student("����", random.nextInt(5) + 1));
        journalScore.add(new Student("����", random.nextInt(5) + 1));
        journalScore.add(new Student("����", random.nextInt(5) + 1));
        journalScore.add(new Student("����", random.nextInt(5) + 1));
        journalScore.add(new Student("�����", random.nextInt(5) + 1));
        Iterator<Student> iter = journalScore.listIterator();
        System.out.println("��� ������� � �� ������:\n"+journalScore);
        System.out.println("������ �������� ���������� �1:");
        for (int i = journalScore.size()-1; i >=0; i--) {
            System.out.println(journalScore.get(i));
        }
        Collections.reverse(journalScore);
        System.out.println("������ �������� ���������� �2:\n"+journalScore);
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
        System.out.println("������� � ������������������� ��������:\n"+journalScore);
        System.out.println("������������ ������ = "+max);
    }
}
