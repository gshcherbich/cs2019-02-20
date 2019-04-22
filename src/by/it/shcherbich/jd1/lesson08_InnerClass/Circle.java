package by.it.shcherbich.jd1.lesson08_InnerClass;

public class Circle extends Shapes2D implements ShapeMethods {

    public Circle(double radius,String name,String color) {
        this.name = name;
        this.color = color;
        this.radius = radius;
        this.square = squre();
        this.perimetre = perimeter();
    }

    @Override
    public String toString() {
        return name+"{" +
                "площадь=" + square +
                ", диаметр=" + uniqueProperty() +
                ", периметр=" + perimetre +
                ", радиус=" + radius +
                ", цвет=" + color +
                '}';
    }

    @Override
    public double squre() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public boolean squareEQUALS(Shapes2D shapes) {
        return square==shapes.square;
    }


    public double uniqueProperty() {
        return 2*radius;
    }
}
