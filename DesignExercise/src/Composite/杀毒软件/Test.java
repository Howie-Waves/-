package Composite.杀毒软件;

public class Test {
    public static void main(String[] args) {
        AbstractFile file = new Folder();
        file.add();
        file.add();
        file.remove();
        file.killVirus();
    }
}
