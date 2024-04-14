package Factory.数据库操作;

public class OracleStatement implements Statement{
    @Override
    public void executeStatement() {
        System.out.println("executing oracle statement...");
    }
}
