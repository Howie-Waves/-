package State.信用卡业务;

import java.sql.SQLOutput;

public class OverdraftState extends State{
    public OverdraftState(Account account){
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
        System.out.println("calcuInterest in  OverdraftState...");
    }
}
