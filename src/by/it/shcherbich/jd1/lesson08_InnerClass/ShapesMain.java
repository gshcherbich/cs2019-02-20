package by.it.shcherbich.jd1.lesson08_InnerClass;

public class ShapesMain {
    public static void main(String[] args) {
        Square square = new Square(4,"�������", "�������");
        System.out.println(square);
        Rectangle rectangle = new Rectangle(4,4,"�������������� ������������","�������");
        System.out.println(rectangle);
        Triangle triangle = new Triangle(2,2,2,"�����������","�������");
        System.out.println(triangle);
        Circle circle = new Circle(5,"����","�����");
        System.out.println(circle);

        ShapeUtils shapeUtils = new ShapeUtils();
        System.out.println(shapeUtils.whoTriangle(triangle));
        System.out.println(square.squareEQUALS(rectangle));
    }
}
