package by.it.shcherbich.jd1.lesson12_Exceptions;

import org.apache.log4j.Logger;

/*
Объявите переменную со значением null. Вызовите метод у этой переменной.
Отловите возникшее исключение.

Создать собственный класс-исключение - наследник класса Exception.
Создать метод, выбрасывающий это исключение.
Вызвать этот метод и отловить исключение. Вывести stacktrace в консоль.
 */
public class task134 {
    public static final Logger LOGGER = Logger.getLogger(task134.class);

    public static void main(String[] args) {
        String str = null;
        try {
            hello(str);
        }
        catch (MyException ex){
            LOGGER.trace(ex + str);
        }

    }
    private static void hello (String str) throws MyException{
        if (!"Привет".equals(str)) {
            throw new MyException ("Не поздоровался, а сказал =");
        }
    }
}
