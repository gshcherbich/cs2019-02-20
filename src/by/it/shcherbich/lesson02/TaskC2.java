package by.it.shcherbich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int i = sc.nextInt();
        System.out.println("Введите второе целое число");
        int j = sc.nextInt();
        int k = i + j;
        System.out.println("DEC:" + i + "+" + j + "=" + k);
        String binary1 = Integer.toBinaryString(i);
        String binary2 = Integer.toBinaryString(j);
        String binary3 = Integer.toBinaryString(k);
        System.out.println("BIN:" + binary1 + "+" + binary2 + "=" + binary3);
        String hex1 = Integer.toHexString(i);
        String hex2 = Integer.toHexString(j);
        String hex3 = Integer.toHexString(k);
        System.out.println("HEX:" + hex1 + "+" + hex2 + "=" + hex3);
        String octal1 = Integer.toOctalString(i);
        String octal2 = Integer.toOctalString(j);
        String octal3 = Integer.toOctalString(k);
        System.out.println("OCT:" + octal1 + "+" + octal2 + "=" + octal3);
    }

}
