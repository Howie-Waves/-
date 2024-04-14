package Observer.电子商务系统;

public class AddressVerify implements Observer{
    String customerInfo;
    public AddressVerify(String name){
        this.customerInfo = name;
    }
    @Override
    public void update() {
        System.out.println("Address Checked for " + customerInfo);
    }
}
