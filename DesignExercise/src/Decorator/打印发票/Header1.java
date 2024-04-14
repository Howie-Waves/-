package Decorator.打印发票;

public class Header1 extends Decorator{
    public Header1(Component component){
        super.myComponent = component;
    }
    @Override
    public void printTicket() {
        super.printTicket();
        System.out.println("print header1...");
        System.out.println();
    }
}
