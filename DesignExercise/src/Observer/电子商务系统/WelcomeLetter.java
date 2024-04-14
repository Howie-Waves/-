package Observer.电子商务系统;

public class WelcomeLetter implements Observer{
    String customerInfo;
    public WelcomeLetter(String name){
        this.customerInfo = name;
    }
    @Override
    public void update() {
        System.out.println("Welcome " + customerInfo + "!");
    }
}
