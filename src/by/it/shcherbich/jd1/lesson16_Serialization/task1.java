package by.it.shcherbich.jd1.lesson16_Serialization;

import java.io.*;

/*
1.	�������� �������� ������ � ������ 5 �� �������� ��� ������������� ������� ����������������
� �� ���������������� ����������� ����� ������.
 */
public class task1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("E:/5mb.txt");
             FileOutputStream fos = new FileOutputStream("E:/5mb_2.txt");
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:/5mb.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/5mb_2.txt"));) {
            long start = System.nanoTime();
            while (fis.available() > 0) {
                fos.write(fis.read());
            }
            long end = System.nanoTime();
            long delta=end-start;
            System.out.println("�� ����������������� ����� = "+delta);
            start = System.nanoTime();
            while (bis.available()>0){
                bos.write(bis.read());
            }
            end = System.nanoTime();
            delta=end-start;
            System.out.println("����������������� ����� = "+delta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

