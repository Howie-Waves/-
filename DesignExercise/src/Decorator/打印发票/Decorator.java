package Decorator.打印发票;

public class Decorator extends Component{
    protected Component myComponent;
    public void printTicket(){
        System.out.print("add decoration:");
    }
}
