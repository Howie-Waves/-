package Factory.数据库操作;

public class MySQLConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("mysql connecting...");
    }
}
