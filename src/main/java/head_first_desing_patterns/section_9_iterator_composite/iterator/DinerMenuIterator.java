package head_first_desing_patterns.section_9_iterator_composite.iterator;

public class DinerMenuIterator implements Iterator<MenuPosition>{
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
}
