package Template.数据图表转XML;

public class XMLData extends DataView{
    @Override
    public void getData() {
        System.out.println("get XML data...");
    }

    @Override
    public void display() {
        System.out.println("折线图展示...");
    }

    @Override
    public boolean isXML() {
        return true;
    }
}
