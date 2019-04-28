package by.it.shcherbich.jd1.lesson11_CollectionSetMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/*
3. Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в двух объектах HashMap в виде:
Ключ: номер степени
Значение: значение множителя

Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8
 */
public class task3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap1 = new HashMap();
        hashMap1.put(5,3);
        hashMap1.put(4,2);
        hashMap1.put(2,7);
        hashMap1.put(3,12);
        System.out.println(hashMap1);
        HashMap<Integer,Integer> hashMap2 = new HashMap();
        hashMap2.put(7,3);
        hashMap2.put(4,6);
        hashMap2.put(5,1);
        hashMap2.put(1,9);
        System.out.println(hashMap2);
        //hashMap1.merge(hashMap2.keySet(),hashMap2.values(), (oldVal, newVal) -> (int)oldVal + (int)newVal);
        Set<Integer> keySet=hashMap1.keySet();
        String str="";
        for (Integer key : keySet) {
            int value=hashMap1.get(key);
            if (hashMap2.containsKey(key)){
                hashMap2.put(key,hashMap2.get(key)+value);
            }
            else {
                hashMap2.put(key,value);
            }
        }
        Set<Integer> keySet2=hashMap2.keySet();
        for (Integer key : keySet2) {
            str=hashMap2.get(key)+"х^"+key+"+"+str;
        }
        //System.out.println(hashMap2);
        System.out.println(str.substring(0, str.length() - 1));
    }
}
