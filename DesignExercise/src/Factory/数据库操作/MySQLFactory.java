package Factory.数据库操作;

public class MySQLFactory implements DBFactory{
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }
}
