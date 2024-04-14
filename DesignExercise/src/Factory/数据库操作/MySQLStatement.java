package Factory.数据库操作;

public class MySQLStatement implements Statement{
    @Override
    public void executeStatement() {
        System.out.println("executing mysql statement...");
    }
}
