package by.it.shcherbich.jd1.lesson04;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Нажмите 0, чтобы посмотреть баланс банкомата");
        System.out.println("Нажмите 1, чтобы загрузить банкноты в банкомат");
        System.out.println("Нажмите 2, чтобы снять наличные");
        System.out.println("Нажмите 3 для выхода");
        int key = sc.nextInt();
        ATM atm = new ATM();
        while (key != 3) {
            if (key == 0) {
                System.out.println("Количество банкнот в аппарате по 20 = " + atm.getTwenty() + "шт., по 50 = " + atm.getFifty() + "шт., по 100 = " + atm.getHundred() + "шт.");
                System.out.println("Максимально возможная сумма для снятия наличных = " + atm.sum());
            } else if (key == 1) {
                atm.addBanknots();
            } else if (key == 2) {
                System.out.println("Какую сумму хотите снять?");
                if (atm.cashWithdrawal(sc.nextInt())){
                }
                else {
                    System.out.println("Запрошенную сумму снять невозможно");
                }
            } else {
                System.out.println("Введите корректное значение меню от 0 до 3");
            }
            key = sc.nextInt();
        }
    }
}


