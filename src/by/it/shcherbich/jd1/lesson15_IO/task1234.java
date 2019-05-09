package by.it.shcherbich.jd1.lesson15_IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
1. ����� ���� � ������������� ������. ��������� � ������� ���� ���� � ������� ���������.
2. ����� ���� � �������, ����� � ������� � ������� ��� �����, ������������ � ������� �����.
3. ����� ���� � �������, ����� � ������� � ������� ��� �����,
��� ������� ��������� ����� ������ ����� ��������� � ������ ������ ���������� �����
4. ����� ���� � �������. � ������ ������ ����� � ������� ���������� ����� ����, ������ ������.
 */
public class task1234 {
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        System.out.println("1. ���� E:/io.txt ������� � ������� ���������:");
        String str1;
        try (BufferedReader br = new BufferedReader(new FileReader("E:/io.txt")))
        {
            while ((str1 = br.readLine()) !=null) {
                str.append(str1+"\n");
                System.out.println(str1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Pattern pattern = Pattern.compile("\\s([���娸��������������]+)([�-��-�]*)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        System.out.println("\n2. C����, ������������ � ������� ����� = " + sb);
        matcher.reset();
        Pattern pattern2 = Pattern.compile("[�-��-�]*([�-��-�]{1}) \\1[�-��-�]*");
        matcher = pattern2.matcher(str);
        sb.delete(0, sb.length());
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        System.out.println("3. ��������������, � ������� ��������� ����� ����� ��������� � ������ ������ ���������� ����� = " + sb);
        matcher.reset();
        Pattern pattern3 = Pattern.compile("[0-9]+");
        matcher = pattern3.matcher(str);
        sb.delete(0, sb.length());
        List arr = new ArrayList();
        while (matcher.find()) {
            arr.add(matcher.group());
        }
        String number = "";
        for (int i = arr.size() - 1; i > 0; i--) {
            if (arr.get(i).toString().length() > arr.get(i - 1).toString().length()) {
                number = arr.get(i).toString();
            } else {
                number = arr.get(i - 1).toString();
            }
        }
        System.out.println("4. ����� � ������� ���������� ����� ����, ������ ������ = " + number);
    }
}
