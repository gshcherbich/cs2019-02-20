package by.it.shcherbich.jd1.lesson15_IO;

import java.io.File;

/*
6. ������� ������ ������ � ��������� ���������� �������� �� ����� � ������ ����������� �����������.
 */
public class task6 {
    public static void main(String[] args) {
        infoDir("E:\\IT\\java\\cs2019-02-20_ver1\\src");
    }

    static void infoDir(String path) {
        File dir = new File(path);
        File[] dirs = dir.listFiles();
        for (File item : dirs) {
            if (item.isDirectory()) {
                System.out.println(item.getName() + "\t �����");
                String temp = String.valueOf(item);
                infoDir(temp);
            } else {
                System.out.println(item.getName() + "\t ����");
            }
        }
    }
}


