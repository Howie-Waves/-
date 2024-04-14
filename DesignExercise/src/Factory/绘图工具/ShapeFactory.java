package Factory.绘图工具;

public class ShapeFactory {
    public Shape createShape(String type) {
        if(type == "circle")
            return new Circle();
        else if(type == "rectangle")
            return new Rectangle();
        else if(type == "triangle")
            return new Triangle();
        else
            throw new UnsupportedOperationException();
    }
}
