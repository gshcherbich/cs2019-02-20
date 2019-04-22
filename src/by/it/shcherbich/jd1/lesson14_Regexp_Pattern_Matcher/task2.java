package by.it.shcherbich.jd1.lesson14_Regexp_Pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2. Написать программу, выполняющую поиск в строке шестнадцатеричных чисел, записанных по правилам Java,
с помощью регулярных выражений и выводящую их на страницу.
 */
public class task2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Fa-f0-9]+");
        Matcher matcher = pattern.matcher("1Fhjt1235AjnBBC");
        StringBuilder sb = new StringBuilder();
        while (matcher.find())
            sb.append(matcher.group() + " ");
        System.out.println(sb);
    }
}
