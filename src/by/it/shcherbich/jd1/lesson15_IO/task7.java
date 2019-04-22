package by.it.shcherbich.jd1.lesson15_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
7. Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл в обратном порядке символы каждой строки.
 */
public class task7 {
    public static void main(String[] args) throws IOException {
        int b = 0;
        FileInputStream fis = null;
        InputStreamReader isr = null;
        List<Character> ch = new ArrayList<>();
        try {
            fis = new FileInputStream("E:/Hello.java");
            isr = new InputStreamReader(fis);
            while ((b = isr.read()) != -1) {
                ch.add((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
            isr.close();
            Collections.reverse(ch);
        }
        FileOutputStream fos = new FileOutputStream("E:/Hello1.java");
        for (int i = 0, chSize = ch.size(); i < chSize; i++) {
            fos.write(ch.get(i));
        }
    }
}
