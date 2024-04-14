package Factory.日志记录;

public class DataBaseLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new DataBaseLog();
    }
}
