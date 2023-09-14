package head_first_desing_patterns.section_9_iterator_composite.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuElement> {

    Stack<Iterator<MenuElement>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuElement> iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()){
            return false;
        }else {
            Iterator<MenuElement> iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public MenuElement next() {
        if(hasNext()){
            Iterator<MenuElement> iterator = stack.peek();
            MenuElement menuElement = iterator.next();
            if(menuElement instanceof Menu){
                stack.push(menuElement.getIterator());
            }
            return menuElement;
        }else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
