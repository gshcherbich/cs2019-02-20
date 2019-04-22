package by.it.shcherbich.jd1.lesson12_Exceptions;

import org.apache.log4j.Logger;

/*
Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
 */
public class task2 {
    public static final Logger LOGGER = Logger.getLogger(task2.class);
    public static void main(String[] args) {
        int[]arr={1,2,3};
        try {
            System.out.println(arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            LOGGER.trace("Вышли за пределы массива", ex);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
