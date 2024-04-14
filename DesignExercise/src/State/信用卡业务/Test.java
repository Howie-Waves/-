package State.信用卡业务;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(20);
        System.out.println("deposit: " + account.getBalance());
        account.withdraw(1000);
        System.out.println("deposit: " + account.getBalance());
        account.computeInterest();
        account.withdraw(1500);
        System.out.println("deposit: " + account.getBalance());
        account.withdraw(20);
        account.computeInterest();
    }
}
