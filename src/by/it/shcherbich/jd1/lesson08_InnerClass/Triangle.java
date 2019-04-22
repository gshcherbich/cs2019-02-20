package by.it.shcherbich.jd1.lesson08_InnerClass;

public class Triangle extends Shapes2D implements ShapeMethods {

    public Triangle(double a, double b, double c, String name, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
        this.color = color;
        this.square = squre();
        this.diagonal = UniqueProperty();
        this.perimetre = perimeter();
    }

    @Override
    public String toString() {
        return name + "{" + "площадь=" + square + ", периметр=" + perimetre + ", высота=" + diagonal + ", a=" + a + ", b=" + b + ", c=" + c + ", цвет=" + color + '}';
    }


    @Override
    public double squre() {
        double p = (a * b * c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public boolean squareEQUALS(Shapes2D shapes) {
        return square == shapes.square;
    }

    public double UniqueProperty() {
        return (2 * square) / a;
    }
}

