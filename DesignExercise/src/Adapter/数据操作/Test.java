package Adapter.数据操作;

public class Test {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new BinarySearch(), new QuickSort());
        adapter.search();
        adapter.sort();
    }
}
