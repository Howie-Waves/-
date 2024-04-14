package Factory.绘图工具;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw a rectangle...");
    }

    @Override
    public void erase() {
        System.out.println("erase the rectangle...");
    }
}
