package by.it.shcherbich.jd1.lesson10_CollectionList;

import java.util.HashSet;
/*
5.	Определить множество на основе множества целых чисел.
Создать методы для определения пересечения и объединения множеств.
 */

public class task5 {
    public static void main(String[] args) {
        HashSet<Integer> int1 = new HashSet<>();
        int1.add(new Integer(1));
        int1.add(new Integer(4));
        int1.add(new Integer(3));
        int1.add(new Integer(2));
        int1.add(new Integer(171));
        HashSet<Integer> int2 = new HashSet<>();
        int2.add(new Integer(0));
        int2.add(new Integer(1));
        int2.add(new Integer(6));
        int2.add(new Integer(171));
        int2.add(new Integer(2));
        int2.add(new Integer(3));
        int2.add(new Integer(5));
        System.out.println("Множество 1: "+int1);
        System.out.println("Множество 2: "+int2);
        HashSet<Integer> int3 = consolidationIntHashSet(int1, int2);
        System.out.println("Объединение множеств: "+int3);
        HashSet<Integer> int4 = crossIntHashSet(int1, int2);
        System.out.println("Пересечение множеств: "+int4);
    }

    static HashSet consolidationIntHashSet(HashSet<Integer> hs1, HashSet<Integer> hs2) {
        HashSet<Integer> int3 = new HashSet<>();
        int3.addAll(hs1);
        int3.addAll(hs2);
        return int3;
    }

    static HashSet crossIntHashSet(HashSet<Integer> hs1, HashSet<Integer> hs2) {
        hs1.retainAll(hs2);
        return hs1;
    }
}