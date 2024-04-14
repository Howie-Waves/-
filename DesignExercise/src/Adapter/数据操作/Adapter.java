package Adapter.数据操作;

public class Adapter implements DataOperation{
    private BinarySearch binarySearch;
    private QuickSort quickSort;
    public Adapter(BinarySearch binarySearch, QuickSort quickSort){
        this.binarySearch = binarySearch;
        this.quickSort = quickSort;
    }
    @Override
    public void sort() {
        quickSort.quickSort();
    }

    @Override
    public void search() {
        binarySearch.binarySearch();
    }
}
