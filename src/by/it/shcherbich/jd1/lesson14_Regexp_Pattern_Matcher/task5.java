package by.it.shcherbich.jd1.lesson14_Regexp_Pattern_Matcher;

import java.util.regex.Pattern;

/*
5. Написать метод, который проверяет, является ли строка адресом IPv4.
 */
public class task5 {
    public static void main(String[] args) {
        System.out.println(isIP("1.0.10.25"));
    }

    static boolean isIP(String str) {
        boolean result = false;
        if (Pattern.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$", str)) {
            result = true;
        }
        return result;
    }
}