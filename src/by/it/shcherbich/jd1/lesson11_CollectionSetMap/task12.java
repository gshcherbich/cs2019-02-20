package by.it.shcherbich.jd1.lesson11_CollectionSetMap;

import java.util.*;
/*
1. �������� ����� countUnique, ������� ��������� ������������� ������ � �������� ��������� � ���������� ���������� ���������� ����� ����� � ���� ������.
��� ��������� ������� ������ ����� ������ ���������� 0.

2. �������� ����� isUnique, ������� ��������� Map<String, String> � ���������� true,
���� ��� ��������� ����� �� ������������� ���� ���������� ���������.
��������, � ������ ������ ������� true:
{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}

� � ������ - false:
{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
 */

public class task12 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("������� 1:");
        System.out.println("������ ����� ����� = " + arr);
        System.out.println("���������� ���������� ����� ����� = " + countUnique(arr));

        TreeMap<String, String> map1 = new TreeMap<String, String>();
        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Camp");
        map1.put("Hal", "Perkins");
        TreeMap<String, String> map2 = new TreeMap<String, String>();
        map2.put("Kendrick", "Perkins");
        map2.put("Stuart", "Reges");
        map2.put("Jessica", "Miller");
        map2.put("Bruce", "Reges");
        map2.put("Hal", "Perkins");
        System.out.println("������� 2:");
        System.out.println(map1.values() + " " + isUnique(map1));
        System.out.println(map2.values() + " " + isUnique(map2));
    }

    private static int countUnique(ArrayList<Integer> arr) {
        TreeSet<Integer> set = new TreeSet<>(arr);
        return set.size();
    }

    private static boolean isUnique(Map<String, String> map) {
        TreeSet<String> set = new TreeSet();
        set.addAll(map.values());
        if (set.size() < map.size()) {
            return false;
        } else {
            return true;
        }
    }
}
