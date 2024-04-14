package Composite.杀毒软件;

public abstract class AbstractFile {
    public abstract void add();
    public abstract void remove();
    public abstract AbstractFile getChild();
    public void killVirus(){
        System.out.println("kill virus...");
    }
}
