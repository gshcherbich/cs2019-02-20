package by.it.shcherbich.jd1.lesson16_Serialization;

import java.io.*;

/*
2.	������� ����� Computer. �������� ��� ��������� �����, ������� ������ ����� ������, ������������� � ����.
��������������� ������ �� ���� �� �����, ������� �������� ����� � �������.
 */
public class task2 {
    public static void main(String[] args) throws ClassNotFoundException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/computer.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/computer.txt"))) {
            Computer comp = new Computer("����", "core i5", 8, 1024);
            oos.writeObject(comp);
            Computer comp2 = (Computer) ois.readObject();
            System.out.printf("������� ����������: %s, ������ ���������� %s, ����������� ������ %d�� ����� ���������� %d�� \n", comp2.getName(), comp2.getCpu(), comp2.getRam(), comp2.getHdd());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
