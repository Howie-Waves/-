package Strategy.电子商务系统;

public class TaskController {
    public static void main(String[] args) {
        CalculateTax calculateTax = new CalculateChinaTax();
        SalesOrder salesOrder = new SalesOrder(calculateTax);

        salesOrder.fillOrderViaGUI();
        salesOrder.printSalesData();
    }
}
