package by.it.shcherbich.jd1.lesson10_CollectionList;

import java.util.Map;
import java.util.TreeMap;

/*
6.	������� �����. ������� ��������� ��� ���� ��������� �������. (������� ���� � ������)
 */
public class task6 {
    public static void main(String[] args) {
        String str = "��� ���� - ��� �����";
        Map<Character, Integer> vacabularu = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            vacabularu.put(str.charAt(i), 0);
        }
        for (int i = 0; i < str.length(); i++) {
            if (vacabularu.containsKey(str.charAt(i))) {
                Integer counter = vacabularu.get(str.charAt(i)) + 1;
                vacabularu.put(str.charAt(i), counter);
            }
        }
        System.out.println(vacabularu.toString());
    }
}

