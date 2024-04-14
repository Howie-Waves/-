package Command.电视遥控器;

public class RemoteControl {
    private Command cmd;

    public void setCmd(Command cmd){
        this.cmd = cmd;
    }

    public void runCommand(){
        cmd.execute();
    }
}
