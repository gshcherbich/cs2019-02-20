package by.it.shcherbich.jd1.lesson14_Regexp_Pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
4. Написать программу, выполняющую поиск в строке мобильных телефонных номеров в формате +375XXYYYYYYY
и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
X - код оператора
Y - номер телефона
 */
public class task4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(\\+)(375)(25|29|33|44)([0-9]{7})");
        Matcher matcher = pattern.matcher("45455+375447211200gfgf+3752915559724343gfg+3752950201814354354f");
        StringBuilder sb = new StringBuilder();
        while (matcher.find())
            sb.append(matcher.group() + " ");
        System.out.println(sb);
        Pattern pattern2 = Pattern.compile("(?<=(\\+375))");
        matcher.reset();
        matcher = pattern2.matcher(sb);
        while (matcher.find()) {
            sb.insert(matcher.start(), " (");
        }
        Pattern pattern3 = Pattern.compile("(?<=(\\()(25|29|33|44))");
        matcher.reset();
        matcher = pattern3.matcher(sb);
        while (matcher.find()) {
            sb.insert(matcher.start(), ") ");
        }
        Pattern pattern4 = Pattern.compile("(?<=(\\s)(\\d{3}))");
        matcher.reset();
        matcher = pattern4.matcher(sb);
        while (matcher.find()) {
            sb.insert(matcher.start(), "-");
        }
        Pattern pattern5 = Pattern.compile("(?<=(\\d{3})(-)(\\d{2}))");
        matcher.reset();
        matcher = pattern5.matcher(sb);
        while (matcher.find())
            sb.insert(matcher.start(), "-");
        System.out.println(sb);
    }
}
