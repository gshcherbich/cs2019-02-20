package by.it.shcherbich.jd1.lesson15_IO;
/*
5. Записать в двоичный файл 20 случайных чисел типа int со значением больше 255.
Прочитать записанный файл, распечатать числа и их среднее арифметическое.
 */
import java.io.*;
import java.util.Random;

public class task5 {
    public static void main(String[] args) throws IOException {
        Random random=new Random();
        int j;
        int sum=0;

        FileOutputStream fos=new FileOutputStream("E:/bin.txt");
        for (int i = 0; i <20 ; i++) {
            j=255+random.nextInt(50);
            sum=sum+j;
            fos.write(j);
            System.out.print(j+" ");
        }
        System.out.println("Среднее арифмитическое = "+sum/20);
        FileInputStream fis=new FileInputStream("E:/bin.txt");
        //InputStreamReader isr = new InputStreamReader(fis);
        DataInputStream dos = new DataInputStream(fis);
        sum=0;
        sum=sum+dos.readInt();
        //while ((j = dos.read()) != -1) {
            //System.out.print(j+" ");
            //sum=sum+j;
        //}
        System.out.println("Среднее арифмитическое = "+sum/20);
    }
}
