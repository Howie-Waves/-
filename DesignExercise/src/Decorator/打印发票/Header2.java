package Decorator.打印发票;

public class Header2 extends Decorator{
    public Header2(Component component){
        super.myComponent = component;
    }
    @Override
    public void printTicket() {
        super.printTicket();
        System.out.println("print header2...");
        System.out.println();
    }
}
