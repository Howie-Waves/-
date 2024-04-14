package Template.数据图表转XML;

public class Test {
    public static void main(String[] args) {
        DataView dv1 = new JsonData();
        dv1.process();
        DataView dv2 = new XMLData();
        dv2.process();
    }
}
