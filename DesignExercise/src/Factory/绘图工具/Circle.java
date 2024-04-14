package Factory.绘图工具;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw a circle...");
    }

    @Override
    public void erase() {
        System.out.println("erase the circle...");
    }
}
