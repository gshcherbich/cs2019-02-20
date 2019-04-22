package by.it.shcherbich.jd1.lesson08_InnerClass;

public class ShapesMain {
    public static void main(String[] args) {
        Square square = new Square(4,"Квадрат", "красный");
        System.out.println(square);
        Rectangle rectangle = new Rectangle(4,4,"Равносторонний прямоуголник","красный");
        System.out.println(rectangle);
        Triangle triangle = new Triangle(2,2,2,"Треугольник","зеленый");
        System.out.println(triangle);
        Circle circle = new Circle(5,"Круг","синий");
        System.out.println(circle);

        ShapeUtils shapeUtils = new ShapeUtils();
        System.out.println(shapeUtils.whoTriangle(triangle));
        System.out.println(square.squareEQUALS(rectangle));
    }
}
