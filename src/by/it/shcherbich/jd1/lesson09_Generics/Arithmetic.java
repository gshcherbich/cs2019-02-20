package by.it.shcherbich.jd1.lesson09_Generics;

public class Arithmetic<A extends Number, B extends Number> {
    A a;
    B b;

    public Arithmetic(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public double sum() {
        if (a instanceof Integer && b instanceof Integer) {
            return (a.intValue() + b.intValue());
        } else {
            return (a.doubleValue() + b.doubleValue());
        }
    }
}
