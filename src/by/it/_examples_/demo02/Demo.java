package by.it._examples_.demo02;   //имя пакета

public class Demo {        //имя класса

    private static final String TEXT = "Поехали!!!!"; //переменная класса

    public static void main(String[] args) { //исполняемый метод класса
        //это однострочный комментарий
        //ниже идут операторы метода main
        System.out.println(TEXT); //вызов метода println вывод на экран

        String s="";              //Это текст локальной переменной s

        printTextMoreTimes(s,3);  //вызов метода
    }

    private static void printTextMoreTimes(String phrase, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(phrase);
        }
    }
}
