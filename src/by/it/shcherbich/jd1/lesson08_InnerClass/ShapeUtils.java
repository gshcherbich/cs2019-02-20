package by.it.shcherbich.jd1.lesson08_InnerClass;

public class ShapeUtils extends Shapes2D{

    public boolean whoTriangle(Shapes2D shape) {
        return shape instanceof Triangle;
    }
    public boolean whoRectangle(Shapes2D shapes){
        return shapes instanceof Rectangle;
    }
}
