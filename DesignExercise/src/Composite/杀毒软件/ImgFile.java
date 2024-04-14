package Composite.杀毒软件;

public class ImgFile extends AbstractFile{
    @Override
    public void add() {
    }

    @Override
    public void remove() {
        System.out.println("remove the imgFile...");
    }

    @Override
    public AbstractFile getChild() {
        return null;
    }
}
