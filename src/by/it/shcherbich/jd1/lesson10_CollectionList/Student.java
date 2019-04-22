package by.it.shcherbich.jd1.lesson10_CollectionList;

public class Student {
    String name;
    Integer score;
    @Override
    public String toString() {
        return name + " оценка = " + score ;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
