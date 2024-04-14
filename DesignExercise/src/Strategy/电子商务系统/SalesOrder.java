package Strategy.电子商务系统;

public class SalesOrder {
    CalculateTax calculateTax;
    public SalesOrder(CalculateTax calculateTax){
        this.calculateTax = calculateTax;
    }

    public double calcuTax(){
        return calculateTax.calcuTax();
    }

    public void fillOrderViaGUI(){
        System.out.println("fill order via GUI...");
    }

    public void printSalesData(){
        System.out.println("Total tax is " + calculateTax.calcuTax());
    }
}
