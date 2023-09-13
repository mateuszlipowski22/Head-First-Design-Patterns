package head_first_desing_patterns.section_9_iterator_composite.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuPosition> {
    private MenuPosition[] menuPositions;
    private int position;

    public DinerMenuIterator(MenuPosition[] menuPositions) {
        this.menuPositions = menuPositions;
        this.position=0;
    }

    @Override
    public boolean hasNext() {
        return position < menuPositions.length && menuPositions[position] != null;
    }

    @Override
    public MenuPosition next() {
        MenuPosition menuPosition=menuPositions[position];
        position++;
        return menuPosition;
    }

    @Override
    public void remove() {
        if(position<=0){
            throw new IllegalStateException("Nie można usunąc elementu przed pierwszym wywołaniem metody next()");
        }

        if(menuPositions[position-1]!=null){
            for (int i=position-1; i< menuPositions.length-1;i++){
                menuPositions[i]=menuPositions[i+1];
            }
            menuPositions[menuPositions.length-1]=null;
        }
    }
}
