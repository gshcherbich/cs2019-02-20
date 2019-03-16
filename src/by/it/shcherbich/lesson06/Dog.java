package by.it.shcherbich.lesson06;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private double power;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Dog() {
    }

    public Dog(String name, int age,int weight,double power) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.power = power;
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age>=0)
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return ("Кличка: " +name+". Возраст: " + age);
    }

    boolean win(Dog otherDog) {
//Шансы на победу = 0.2 * возраст + 0.3 * вес + 0.5 * силу укуса.
        double my=(this.age*0.2 + 0.3*this.weight+0.5*this.power);
        double vrag=(otherDog.age*0.2 + 0.3*otherDog.weight+0.5*otherDog.power);
        return my>vrag;
    }
}
