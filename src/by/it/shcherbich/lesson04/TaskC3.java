package by.it.shcherbich.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    private static String getCifra(int dig) {
        switch (dig) {
            case 1:
                return "один";
            case 2:
                return "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            default:
                return null;
        }
    }

    private static String getDecades(int dig) {
        switch (dig) {
            case 1:
                return "десять";
            case 2:
                return "двадцать";
            case 3:
                return "тридцать";
            case 4:
                return "сорок";
            case 5:
                return "пятьдесят";
            case 6:
                return "шестьдесят";
            case 7:
                return "семьдесят";
            case 8:
                return "восемьдесят";
            case 9:
                return "девяносто";
            default:
                return null;
        }
    }

    private static String getTeens(int dig) {
        String s = "";
        switch (dig) {
            case 1:
                s = "один";
                break;
            case 2:
                s = "две";
                break;
            case 3:
                s = "три";
                break;
            case 4:
                s = "четыр";
                break;
            case 5:
                s = "пят";
                break;
            case 6:
                s = "шест";
                break;
            case 7:
                s = "сем";
                break;
            case 8:
                s = "восем";
                break;
            case 9:
                s = "девят";
                break;
        }
        return s + "надцать";
    }

    public static void main(String[] args) {
        String str1;
        String str2;
        String str3;
        String str4;
        int mult;
        int mult0;
        int mult1;
        int mult2;

        for (int i = 2; i <= 10; i++) {
            if (i % 10 != 0) str1 = getCifra(i) + " умножить на ";
            else str1 = "десять умножить на ";
            for (int j = 2; j <= 10; j++) {
                if (j % 10 != 0) str2 = getCifra(j) + " равно ";
                else str2 = "десять равно ";
                mult = i * j;
                if (mult<10) {
                    str3 = getCifra(mult);
                    System.out.println(str1 + str2 + str3);
                }
                if (mult < 20 && mult > 10) {
                    mult1=mult-10;
                    str3 = getTeens(mult1);
                    System.out.println(str1 + str2 + str3);
                }
                if (mult>20&&mult % 10 != 0) {
                    mult2 = (mult / 10) * 10;
                    mult1 = mult / 10;
                    mult0 = mult - mult2;
                    str3 = getDecades(mult1);
                    str4 = " " +getCifra(mult0);
                    System.out.println(str1 + str2 + str3 + str4);
                }
                if (mult % 10 == 0&&mult!=100) {
                    mult1 = mult / 10;
                    str3 = getDecades(mult1);
                    System.out.println(str1 + str2 + str3);
                }
                if (mult==100) System.out.println(str1 + str2 + "сто");

            }

        }
    }
}
