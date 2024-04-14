package State.信用卡业务;

public abstract class State {
    protected Account account;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void calculateInterest();
    public void stateCheck(){
        if(account.getBalance() >= 0)
            account.setState(new NormalState(account));
        else if (account.getBalance() > -2000)
            account.setState(new OverdraftState(account));
        else
            account.setState(new RestrictedState(account));
    }
}
