package head_first_desing_patterns.section_9_iterator_composite.iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuPosition>{

    private List<MenuPosition> menuPositions;
    private int position;

    public PancakeHouseMenuIterator(List<MenuPosition> menuPositions) {
        this.menuPositions = menuPositions;
        this.position=0;
    }

    @Override
    public boolean hasNext() {
        return position < menuPositions.size() && menuPositions.get(position) != null;
    }

    @Override
    public MenuPosition next() {
        MenuPosition menuPosition=menuPositions.get(position);
        position++;
        return menuPosition;
    }
}
