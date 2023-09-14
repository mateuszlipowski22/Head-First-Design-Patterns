package head_first_desing_patterns.section_9_iterator_composite.composite;

import java.util.Iterator;

public abstract class MenuElement {

    public void add(MenuElement menuElement){
        throw new UnsupportedOperationException();
    }

    public void delete(MenuElement menuElement){
        throw new UnsupportedOperationException();
    }

    public MenuElement getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuElement> getIterator(){
        throw new UnsupportedOperationException();
    }
}
