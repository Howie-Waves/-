package Factory.日志记录;

public class DataBaseLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("write databaseLog...");
    }
}
