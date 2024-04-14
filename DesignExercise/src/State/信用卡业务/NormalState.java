package State.信用卡业务;

public class NormalState extends State{
    public NormalState(Account account){
        this.account = account;
    }
    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void calculateInterest() {
        System.out.println("calcuInterest in  NormalState...");
    }
}
