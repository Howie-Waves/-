package Singleton.多文档窗口;

public class SubFrame {
    private volatile static SubFrame subFrame;
    private SubFrame(){}
    //方法1：同步getSubFrame
//    public synchronized static SubFrame getSubFrame(){
//        if(subFrame == null)
//            subFrame = new SubFrame();
//        return subFrame;
//    }

    //方法2：急切实例化
//    private static SubFrame subFrame = new SubFrame();
//    public static SubFrame getSubFrame(){
//        return subFrame;
//    }

    //方法3：双重检查枷锁
    public static SubFrame getSubFrame() {
        if (subFrame == null) {
            synchronized (SubFrame.class) {
                if (subFrame == null) {
                    subFrame = new SubFrame();
                }
            }
        }
        return subFrame;
    }
}
