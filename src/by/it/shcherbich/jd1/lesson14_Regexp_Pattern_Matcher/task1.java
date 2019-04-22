package by.it.shcherbich.jd1.lesson14_Regexp_Pattern_Matcher;

import lombok.Data;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
1. Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы.
Возможные домены верхнего уровня: .org .com

 */

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isMail(str));
    }

    static boolean isMail(String str) {
        boolean result = Pattern.matches("(\\b[a-zA-Z]+)(\\w+)@(\\w*)\\.(org|com)", str);
        return result;
    }
}
