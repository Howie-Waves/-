package Decorator.打印发票;

public class Footer2 extends Decorator{
    public Footer2(Component component){
        super.myComponent = component;
    }
    @Override
    public void printTicket() {
        super.printTicket();
        System.out.println("print footer2...");
        System.out.println();
    }
}
