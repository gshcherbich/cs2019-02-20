package by.it.shcherbich.jd1.lesson04;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Задайте промежуток времени количеством секунд ");
        Scanner sc = new Scanner(System.in);
        TimeInterval timeInterval=new TimeInterval(sc.nextInt());
        timeInterval.print();
        System.out.println("Задайте промежуток времени количеством секунд, минут, часов ");
        TimeInterval timeInterval2=new TimeInterval(sc.nextInt(),sc.nextInt(),sc.nextInt());
        timeInterval2.print();
    }
}
