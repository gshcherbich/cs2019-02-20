package by.it.shcherbich.jd1.lesson15_IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1. «адан файл с многострочным тестом. ѕрочитать и вывести этот файл в консоль построчно.
2. «адан файл с текстом, найти и вывести в консоль все слова, начинающиес€ с гласной буквы.
3. «адан файл с текстом, найти и вывести в консоль все слова,
дл€ которых последн€€ буква одного слова совпадает с первой буквой следующего слова
4. «адан файл с текстом. ¬ каждой строке найти и вывести наибольшее число цифр, идущих подр€д.
 */
public class task12 {
    public static void main(String[] args) throws IOException {
        int b = 0;
        FileInputStream fis = null;
        InputStreamReader isr = null;
        StringBuilder str = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        try {
            fis = new FileInputStream("E:/io.txt");
            isr = new InputStreamReader(fis);
            while ((b = isr.read()) != -1) {
                str.append(((char) b));
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
            isr.close();
        }
        Pattern pattern = Pattern.compile("\\s([ја≈е®Є»иќо”уЁэџыёюя€]+)([ј-яа-€]*)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            sb.append(matcher.group() + " ");
        }
        System.out.println("\n2.Cлова, начинающиес€ с гласной буквы = " + sb);
        String str3= String.valueOf(str);
        Pattern pattern2 = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[]words=pattern2.split(str3);
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);

        }


    }
}
