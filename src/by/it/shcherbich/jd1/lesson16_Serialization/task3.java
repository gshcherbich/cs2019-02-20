package by.it.shcherbich.jd1.lesson16_Serialization;

import java.io.*;

/*
3.	Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса со своими полями.
Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
 */
public class task3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/notebook.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/notebook.txt"))){
            Notebook note = new Notebook("ПЭВМ", "core i7", 16,1024,new Touchpad("сенсорный"), "IPS");
            oos.writeObject(note);
            Notebook note2=(Notebook) ois.readObject();
            System.out.println(note2);
        }
    }
}
