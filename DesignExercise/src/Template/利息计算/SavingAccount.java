package Template.利息计算;

public class SavingAccount extends CalcuInterest{
    public SavingAccount(String account, String psw) {
        super(account, psw);
    }

    @Override
    public void calInterest() {
        interest = 8.88;
    }
}
