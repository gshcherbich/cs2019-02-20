package by.it.shcherbich.lesson03;

import java.util.Scanner;
/*
Lesson 03. Конвертер температуры

Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия.
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.

Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32) * 5/9

Пример:
В метод convertCelsiumToFahrenheit на вход подается значение 40.

Пример вывода:
104.0


Требования:
1. Метод convertCelsiumToFahrenheit(int) должен быть не приватным и статическим.
2. Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
3. Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
4. Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия
в градусы Фаренгейта и возвращать это число.*/


class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double converter = convertCelsiumToFahrenheit(i);
        System.out.println(converter);
    }

    static double convertCelsiumToFahrenheit(int tc) {
        return 9 * tc / 5.0 + 32;
    }

}
