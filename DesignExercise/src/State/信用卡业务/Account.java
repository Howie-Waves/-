package State.信用卡业务;

public class Account {
    private State state;
    private double balance;
    public Account(){
        this.state = new NormalState(this);
        this.balance = 0;
    }
    public void deposit(double amount){
        state.deposit(amount);
    }
    public void withdraw(double amount){
        state.withdraw(amount);
    }
    public void computeInterest(){
        state.calculateInterest();
    }
    public State getState() {
        return state;
    }
    public void setState(State state){
        this.state = state;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
