package Decorator.打印发票;

public class SalesTicket extends Component{
    @Override
    public void printTicket() {
        System.out.println("Invoice Body...");
    }
}
