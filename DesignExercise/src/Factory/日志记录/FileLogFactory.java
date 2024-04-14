package Factory.日志记录;

public class FileLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new FileLog();
    }
}
