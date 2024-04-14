package Facade.文件加密;

public class Test {
    public static void main(String[] args) {
        FileReader fr = new FileReader();
        FileWriter fw = new FileWriter();
        CipherMachine cm = new CipherMachine();

        Encrypt encrypt = new Encrypt(fr, fw, cm);
        encrypt.fileEncrypt();
    }
}
