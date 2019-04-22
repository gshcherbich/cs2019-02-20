package by.it.shcherbich.jd1.lesson08_InnerClass;

public class Rectangle extends Shapes2D implements ShapeMethods  {
    Rectangle(double a,double b, String name, String color) {
        this.a = a;
        this.b = b;
        this.name = name;
        this.color = color;
        this.square = squre();
        this.perimetre = perimeter();
        this.diagonal = UniqueProperty();

    }

    @Override
    public String toString() {
        return name +" {" +
                "площадь=" + square +
                ", периметр=" + perimetre +
                ", диагональ=" + diagonal +
                ", a=" + a +
                ", цвет=" + color +
                '}';
    }

    @Override
    public double squre() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }
    @Override
    public boolean squareEQUALS(Shapes2D shapes) {
        return square==shapes.square;
    }

    public double UniqueProperty() {
        return Math.sqrt((a*a)+(b*b));
    }
}
