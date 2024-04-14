package Command.电视遥控器;

public class ChangeChannel implements Command{
    private TV tv;
    public ChangeChannel(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.changeChannel();
    }
}
