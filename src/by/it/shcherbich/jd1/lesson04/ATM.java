package by.it.shcherbich.jd1.lesson04;

import java.util.Scanner;

/*
Создать класс, описывающий банкомат.
Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение-успешность выполнения операции.
При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами-количеством купюр каждого номинала.
 */
public class ATM {
    private int twenty;
    private int fifty;
    private int hundred;
    private int sum;

    public int sum() {
        this.sum = 20 * this.twenty + 50 * this.fifty + 100 * this.hundred;
        return this.sum;
    }

    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty = twenty;
    }

    public void setFifty(int fifty) {
        this.fifty = fifty;
    }

    public void setHundred(int hundred) {
        this.hundred = hundred;
    }

    public int getFifty() {
        return fifty;
    }

    public int getHundred() {
        return hundred;
    }

    public void addBanknots() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите загружаемое количество купюр номиналом 20: ");
        this.twenty = this.twenty + sc.nextInt();
        System.out.print("Укажите загружаемое количество купюр номиналом 50: ");
        this.fifty = this.fifty + sc.nextInt();
        System.out.print("Укажите загружаемое количество купюр номиналом 100: ");
        this.hundred = this.hundred + sc.nextInt();
    }

    boolean cashWithdrawal(int needSum) {
        boolean transactionCompleted = false;
        if (needSum <= this.sum() && needSum != 10 && needSum != 30 && needSum % 10 == 0) {
            for (int dvadcatka = 0; dvadcatka <= twenty; dvadcatka++) {
                for (int piatidesiatka = 0; piatidesiatka <= fifty; piatidesiatka++) {
                    for (int sotka = 0; sotka <= hundred; sotka++) {
                        if (needSum == sotka * 100 + piatidesiatka * 50 + dvadcatka * 20) {
                            System.out.println("Выдано купюрами: по 20 = " + dvadcatka + "шт., по 50 = " + piatidesiatka + "шт., по 100 = " + sotka + "шт.");
                            hundred = hundred - sotka;
                            fifty = fifty - piatidesiatka;
                            twenty = twenty - dvadcatka;
                            transactionCompleted = true;
                            return transactionCompleted;
                        }
                    }
                }
            }
        }
        return transactionCompleted;
    }
}

