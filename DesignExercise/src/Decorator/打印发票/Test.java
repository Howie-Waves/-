package Decorator.打印发票;

public class Test {
    public static void main(String[] args) {
        Component salesTicket = new SalesTicket();
        salesTicket = new Header1(salesTicket);
        salesTicket = new Header2(salesTicket);
        salesTicket = new Footer1(salesTicket);

        salesTicket.printTicket();
    }
}
