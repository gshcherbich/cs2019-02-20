package by.it.shcherbich.jd1.lesson10_CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
7.	������������ ���������. �� ��������� ��������������� ��������,
����������� ������������� �������� ���������������� ������ � �����,
� ������������� � � ������ ����� ������.
 */
public class task7 {
    public static void main(String[] args) {
        List arr = new ArrayList();
        for (int i = -5; i <= 5; i++) {
            arr.add(i);
        }
        Collections.shuffle(arr);
        System.out.println("������������ ��������� = " + arr);
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println("��������� �������������� �� �������� = " + arr);
    }
}
