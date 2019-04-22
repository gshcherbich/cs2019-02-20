package by.it.shcherbich.jd1.lesson13_Strings;

/*
1. Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.
 */
public class task1234 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str = str.concat("01");
        }
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения concat = " + (finish - start) + " миллисек.");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb = sb.append("01");
        }
        finish = System.currentTimeMillis();
        System.out.println("Время выполнения append = " + (finish - start) + " миллисек.");
/*
2. Заменить все грустные смайлы :( в строке на весёлые :)
 */
        str = ":(:(:(:(:(:(";
        System.out.println(str);
        System.out.println(str.replace("(", ")"));
/*
3. Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true,
если строка начинается и заканчивается этим словом.
*/
        str="один два три один";
        System.out.println(startEndString(str,"один"));
/*
4. Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы
в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
*/
String familia="Щербич";
String name="Григорий";
String otchestvo="Иванович";
        System.out.println(fio(familia,name,otchestvo));

    }
    static boolean startEndString(String str, String word) {
        if (str.startsWith(word) && str.endsWith(word)) {
            return true;
        } else return false;
    }
    static StringBuilder fio (String familia,String name,String otchestvo){
        StringBuilder fio=new StringBuilder();
        fio.append(familia.charAt(0)).append(".").append(name.charAt(0)).append(".").append(otchestvo.charAt(0)).append(".");
        fio.toString().toUpperCase();
        return fio;
    }
}
