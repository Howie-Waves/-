package Factory.数据库操作;

public interface DBFactory {
    Connection createConnection();
    Statement createStatement();
}
