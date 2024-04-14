package Factory.绘图工具;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw a triangle...");
    }

    @Override
    public void erase() {
        System.out.println("erase the triangle");
    }
}
