package Command.电视遥控器;

public class TurnOff implements Command{
    private TV tv;
    public TurnOff(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOff();
    }
}
