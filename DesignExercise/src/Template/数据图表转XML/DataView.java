package Template.数据图表转XML;

public abstract class DataView {
    public abstract void getData();
    public abstract void display();
    public abstract boolean isXML();
    public void convertData(){
        System.out.println("convert to XML...");
    }

    public void process(){
        getData();
        if(!isXML())
            convertData();
        display();
    }
}
