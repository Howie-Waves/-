package Facade.文件加密;

public class Encrypt {
    private FileReader fileReader;
    private FileWriter fileWriter;
    private CipherMachine cipherMachine;

    public Encrypt(FileReader fileReader, FileWriter fileWriter, CipherMachine cipherMachine) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
        this.cipherMachine = cipherMachine;
    }

    public void fileEncrypt(){
        fileReader.readFile();
        cipherMachine.encrypt();
        fileWriter.writeFile();
    }
}
