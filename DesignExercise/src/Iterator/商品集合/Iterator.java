package Iterator.商品集合;

public interface Iterator {
    boolean hasNext();
    boolean hasPrevious();
    Collection next();
    Collection previous();
    void remove(int pos);
}
