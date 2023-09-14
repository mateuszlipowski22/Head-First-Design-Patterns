package head_first_desing_patterns.section_9_iterator_composite.composite;

import java.util.Iterator;

public class EmptyIterator implements Iterator<MenuElement> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuElement next() {
        return null;
    }
}
