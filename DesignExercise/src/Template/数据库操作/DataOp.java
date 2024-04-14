package Template.数据库操作;

public abstract class DataOp {
    public void openDB(){
        System.out.println("open database..");
    }

    public abstract void connDB();
    public void useDB(){
        System.out.println("using database...");
    }
    public void closeDB(){
        System.out.println("close database...");
    }

    public void process(){
        openDB();
        connDB();
        useDB();
        closeDB();
    }
}
