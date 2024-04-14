package Factory.绘图工具;

public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("rectangle");
        shape.draw();
        shape.erase();
    }
}
