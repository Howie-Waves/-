package Factory.日志记录;

public class Test {
    public static void main(String[] args) {
        LogFactory fileLogFac = new FileLogFactory();
        Log fileLog = fileLogFac.createLog();
        fileLog.writeLog();
    }
}
