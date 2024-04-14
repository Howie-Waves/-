package Composite.杀毒软件;

public class TextFile extends AbstractFile{
    @Override
    public void add() {
    }

    @Override
    public void remove() {
        System.out.println("remove the textFile...");
    }

    @Override
    public AbstractFile getChild() {
        return null;
    }
}
