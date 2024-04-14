package Factory.数据库操作;

public class Test {
    public static void main(String[] args) {
        DBFactory oracleFac = new OracleFactory();
        Connection oracleConnection = oracleFac.createConnection();
        oracleConnection.connect();
        Statement oracleStatement = oracleFac.createStatement();
        oracleStatement.executeStatement();
    }
}
