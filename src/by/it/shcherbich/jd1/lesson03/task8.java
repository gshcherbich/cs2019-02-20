package by.it.shcherbich.jd1.lesson03;

import java.util.Date;
import java.util.Random;

/*
Написать программу, перемешивающую и печатающую список карт в колоде.
Воспользоваться результатом предыдущей задачи.
 */
public class task8 {
    public static void main(String[] args) {
        Random generator = new Random(new Date().getTime());
        String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] card = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] coloda = new String[52];
        System.out.println("Сортированная колода:");
        int counter = 0;
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                coloda[counter] = (card[i] + "Of" + suit[j]);
                System.out.println(coloda[counter]);
                counter++;
            }
        }
        for (int i = 0; i < coloda.length; i++) {
            int newPos = generator.nextInt(coloda.length);
            String curCard = coloda[i];
            coloda[i] = coloda[newPos];
            coloda[newPos] = curCard;
        }
        System.out.println("Перетасованная колода:");
        for (int i = 0; i < coloda.length; i++) {
            System.out.println(coloda[i]);
        }
    }
}
