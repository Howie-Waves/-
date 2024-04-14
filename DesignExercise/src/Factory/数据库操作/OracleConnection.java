package Factory.数据库操作;

public class OracleConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("oracle connecting...");
    }
}
