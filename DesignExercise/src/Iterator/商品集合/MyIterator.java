package Iterator.商品集合;

import java.util.List;

public class MyIterator implements Iterator{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Collection next() {
        return null;
    }

    @Override
    public Collection previous() {
        return null;
    }

    @Override
    public void remove(int pos) {
    }
}
