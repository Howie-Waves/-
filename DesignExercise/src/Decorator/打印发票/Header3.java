package Decorator.打印发票;

public class Header3 extends Decorator{
    public Header3(Component component){
        super.myComponent = component;
    }
    @Override
    public void printTicket() {
        super.printTicket();
        System.out.println("print header3...");
        System.out.println();
    }
}
