package Template.利息计算;

public class Test {
    public static void main(String[] args) {
        String username = "Howie";
        String password = "123456";
        CalcuInterest currentAccount = new CurrentAccount(username, password);
        currentAccount.process();
    }
}
