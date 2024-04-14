package Iterator.商品集合;

public class ProductCollection implements Collection{
    @Override
    public Iterator createIterator() {
        return new MyIterator();
    }
}
