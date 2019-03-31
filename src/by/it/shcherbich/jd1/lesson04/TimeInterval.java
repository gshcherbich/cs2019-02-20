package by.it.shcherbich.jd1.lesson04;

/*
Создать класс, описывающий промежуток времени.
Сам промежуток времени должен задаваться тремя свойствами:
секундами, минутами и часами.
Создать метод для получения полного количества секунд в объекте
Создать два конструктора: первый принимает общее количество секунд,
второй-часы, минуты и секунды по отдельности.
Создать метод для вывода данных.
Написать программу для тестирования возможностей класса.
 */
public class TimeInterval {
    private int sec;
    private int min;
    private int hour;
    private int totalSec;

    TimeInterval(int sec, int min, int hour) {
        if (sec < 0 || min < 0 || hour < 0) {
            System.out.println("Секунды, минуты, часы не могут иметь отрицательных значений");
            System.exit(0);
        } else {
            this.sec = sec % 60;
            this.min = min + sec / 60;
            this.hour = hour;
            if (this.min >= 60) {
                this.hour = hour + this.min / 60;
                this.min = this.min % 60;
            }
        }
    }

    TimeInterval(int sec) {
        if (sec < 0) {
            System.out.println("Секунды не могут иметь отрицательных значений");
            System.exit(0);
        } else {
            this.sec = sec % 60;
            this.min = sec / 60;
            if (this.min >= 60) {
                this.hour = this.hour + this.min / 60;
                this.min = this.min % 60;
            }
        }
    }

    private int getTotalSec() {
        totalSec = this.sec + 60 * this.min + 3600 * this.hour;
        return totalSec;
    }

    public void print() {
        System.out.println("Полное количество секунд в промежутке " + this.sec + " сек. " + this.min + " мин. " + this.hour + " ч. = " + getTotalSec() + " сек.");
    }
}

