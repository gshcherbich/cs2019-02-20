package by.it.shcherbich.jd1.lesson13_Strings;

import java.util.Scanner;

/*
5. Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
 */
public class task56 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите несколько слов, разделенные любым количеством пробелов");
        sb = sb.append(sc.nextLine());
        String str = sb.toString();
        str = str.trim();
        int n = 0;
        char probel;
        for (int i = 0; i < str.length(); i++) {
            probel = str.charAt(i);
            if (probel == ' ') {
                n++;
                while (str.charAt(i + 1) == ' ') {
                    i++;
                }
            }
        }
        System.out.println("Задача 5: Количество слов в тексте = " + (n + 1));
        System.out.println("Задача 6: удаляем повторяющиеся символы в строке =ппппппррррииветттт=" + sb("ппппппррррииветттт"));
    }
/*
6. Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
*/
    static StringBuffer sb(String str) {
        StringBuffer sb = new StringBuffer(str);
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                sb.delete(i - 1, i);
            }
        }
        return sb;
    }
}
