package by.it.shcherbich.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int sum = i;
        for (byte k = 2; k <= j; k++) {
            if (k == 2 || k == 4 || k == 6 || k == 8 || k == 9 || k == 11) sum = sum + 31;
            if (k == 3) sum = sum + 28;
            if (k == 5 || k == 7 || k == 10 || k == 12) sum = sum + 30;
        }
        System.out.println(sum);
    }

}
