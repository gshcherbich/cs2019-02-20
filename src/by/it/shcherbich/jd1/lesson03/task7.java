package by.it.shcherbich.jd1.lesson03;

import java.util.Date;
import java.util.Random;

/*
Написать программу, эмулирующую выдачу случайной карты из колоды в 52 карты.
Вывести результат в формате "КартаofМасть". Например,"AceofSpades".
Валет-Jack,Дама-Queen,Король-King,Туз-Ace,Червы-Hearts,Пики-Spades, Трефы-Clubs,Бубны-Diamonds
 */
public class task7 {
    public static void main(String[] args) {
        String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] card = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        Random generator = new Random(new Date().getTime());
        System.out.println(suit[generator.nextInt(4)] + "Of" + card[generator.nextInt(13)]);
    }
}
