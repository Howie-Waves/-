package Template.数据图表转XML;

import Template.数据库操作.DataOp;

public class JsonData extends DataView {
    @Override
    public void getData() {
        System.out.println("get Json data...");
    }

    @Override
    public void display() {
        System.out.println("柱状图展示...");
    }

    @Override
    public boolean isXML() {
        return false;
    }
}
