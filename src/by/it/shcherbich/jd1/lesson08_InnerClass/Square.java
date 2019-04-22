package by.it.shcherbich.jd1.lesson08_InnerClass;

public class Square extends Shapes2D implements ShapeMethods {
    Square(double a, String name, String color) {
        this.a = a;
        this.name = name;
        this.color = color;
        this.square = squre();
        this.perimetre = perimeter();
        this.diagonal = UniqueProperty();

    }

    @Override
    public String toString() {
        return name + " {" + "площадь=" + square + ", периметр=" + perimetre + ", диагональ=" + diagonal + ", сторона=" + a + ", цвет=" + color + '}';
    }

    @Override
    public double squre() {
        return a * a;
    }

    @Override
    public double perimeter() {
        return a * 4;
    }

    @Override
    public boolean squareEQUALS(Shapes2D shapes) {
        return square == shapes.square;
    }


    public double UniqueProperty() {
        return Math.sqrt(2) * a;
    }

}
