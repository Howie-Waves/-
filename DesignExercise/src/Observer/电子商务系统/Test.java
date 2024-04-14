package Observer.电子商务系统;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Customer("Kivi");

        Observer welcomeLetter = new WelcomeLetter(((Customer) subject).getInfo());
        subject.addObserver(welcomeLetter);
        subject.notifyObservers();

        Observer addressVerify = new AddressVerify(((Customer) subject).getInfo());
        subject.addObserver(addressVerify);
        subject.notifyObservers();

        subject.removeObserver(addressVerify);
        subject.notifyObservers();
    }
}
