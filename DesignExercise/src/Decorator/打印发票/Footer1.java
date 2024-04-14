package Decorator.打印发票;

public class Footer1 extends Decorator{
    public Footer1(Component component){
        super.myComponent = component;
    }
    @Override
    public void printTicket() {
        super.printTicket();
        System.out.println("print footer1...");
        System.out.println();
    }
}
