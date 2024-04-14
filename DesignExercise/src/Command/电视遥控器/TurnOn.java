package Command.电视遥控器;

public class TurnOn implements Command{
    private TV tv;
    public TurnOn(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOn();
    }
}
