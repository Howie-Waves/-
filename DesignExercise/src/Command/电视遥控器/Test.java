package Command.电视遥控器;

public class Test {
    public static void main(String[] args) {
        //创建接收者Receiver
        TV tvReceiver = new TV();
        //创建调用者Invoker
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCmd(new TurnOn(tvReceiver));
        remoteControl.runCommand();
    }
}
