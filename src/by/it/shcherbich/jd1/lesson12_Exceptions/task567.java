package by.it.shcherbich.jd1.lesson12_Exceptions;

import org.apache.log4j.Logger;

import java.util.Random;

/*
5. Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное, указав в качестве причины отловленное.
6. Создать метод случайным образом выбрасывающий одно из 3-х видов исключений. Вызвать этот метод в блоке try-catch,
отлавливающем любое из 3-х.
7. Написать метод, который в 50% случаев бросает исключение. Вызвать этот метод в конструкции try-catch-finally.
Протестировать работу блока finally.
 */
public class task567 {
    public static final Logger LOGGER = Logger.getLogger(task567.class);

    public static void main(String[] args) throws Exception {
        try {
            throw1();
        } catch (MyException | IllegalAccessException | IllegalArgumentException ex) {
            LOGGER.trace("Одно из трех видов исключений", ex);
        }
        finally {
            System.out.println("Задание 7: Блок finally выполняется в любом случае, возникло ли исключение в блоке try или нет");
        }
        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException ex) {
            throw new MyException("Задание 5: Выход за пределы массива. Причина = ", ex);
        }
    }

    public static void throw1() throws Exception {
        Random rand = new Random();
        int j = rand.nextInt(2);
        if (j == 0) {
            System.out.println("Метод не выдал исключительных ситуаций");
        } else {
            int i = rand.nextInt(3);
            if (i == 0) {
                throw new MyException("Задание 6: Мое собственное исключение");
            }
            if (i == 1) {
                throw new IllegalAccessException("Задание 6:");
            }
            if (i == 2) {
                throw new IllegalArgumentException("Задание 6:");
            }
        }
    }
}
