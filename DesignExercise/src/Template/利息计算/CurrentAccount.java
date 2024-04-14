package Template.利息计算;

public class CurrentAccount extends CalcuInterest{
    public CurrentAccount(String account, String psw) {
        super(account, psw);
    }

    @Override
    public void calInterest() {
        interest = 6.66;
    }
}
