package Composite.杀毒软件;

import java.util.List;

public class Folder extends AbstractFile{
    @Override
    public void add() {
        System.out.println("add a file in the folder...");
    }

    @Override
    public void remove() {
        System.out.println("remove a folder in the folder...");
    }

    @Override
    public AbstractFile getChild() {
        return null;
    }
}
