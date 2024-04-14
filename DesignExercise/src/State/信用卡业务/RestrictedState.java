package State.信用卡业务;

public class RestrictedState extends State{
    public RestrictedState(Account account){
        this.account = account;
    }
    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Restricted... You can't withdraw...");
    }

    @Override
    public void calculateInterest() {
        System.out.println("calcuInterest in  RestrictedState...");
    }
}
