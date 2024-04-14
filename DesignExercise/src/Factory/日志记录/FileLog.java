package Factory.日志记录;

public class FileLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("write fileLog...");
    }
}
