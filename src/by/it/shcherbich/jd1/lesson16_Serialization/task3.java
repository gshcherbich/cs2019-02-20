package by.it.shcherbich.jd1.lesson16_Serialization;

import java.io.*;

/*
3.	������� ����� Notebook - ��������� Computer. � ���� ������ ������ ���� ���� ���� Touchpad - ����� ���������� ������ �� ������ ������.
�������� � ����� Notebook transient-����. ������� ������ ������ Notebook, ������������� � ����.
��������������� ������ �� �����, ������������������, ��� transient-���� �� �������������.
 */
public class task3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/notebook.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/notebook.txt"))){
            Notebook note = new Notebook("����", "core i7", 16,1024,new Touchpad("���������"), "IPS");
            oos.writeObject(note);
            Notebook note2=(Notebook) ois.readObject();
            System.out.println(note2);
        }
    }
}
