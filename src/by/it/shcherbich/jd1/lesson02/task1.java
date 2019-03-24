package by.it.shcherbich.jd1.lesson02;

import java.util.Scanner;

/*Запросить у пользователя 2 слова.
Если они одинаковы -вывести "Отлично! Слова одинаковы".
Если они отличаются лишь регистром -"Хорошо. Почти одинаковы"
Если они отличаются, но одной длины-"Ну, хотя бы они одной длины"
ИспользоватьметодыклассаString: equals(String string),equalsIgnoreCase(String string),length()
 */
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stroka1 = sc.next();
        String stroka2 = sc.next();
        sc.close();
        if (stroka1.equals(stroka2)) System.out.println("Отлично! Слова одинаковы");
        else if (stroka1.equalsIgnoreCase(stroka2)) System.out.println("Хорошо. Почти одинаковы");
        else if (stroka1.length() == stroka2.length()) System.out.println("Ну, хотя бы они одной длины");
    }
}
