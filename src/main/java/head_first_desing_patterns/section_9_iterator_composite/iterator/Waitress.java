package head_first_desing_patterns.section_9_iterator_composite.iterator;

import java.util.Iterator;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator<MenuPosition> pancakeHouseMenuIterator = pancakeHouseMenu.getIterator();
        Iterator<MenuPosition> dinerMenuIterator = dinnerMenu.getIterator();

        System.out.println("\nMenu śniadaniowe");
        int i=1;
        while(pancakeHouseMenuIterator.hasNext()){
            MenuPosition menuPosition = pancakeHouseMenuIterator.next();
            printMenuPosition(menuPosition, i );
            i++;
        }

        i=1;
        System.out.println("\nMenu obiadowe");
        while(dinerMenuIterator.hasNext()){
            MenuPosition menuPosition = dinerMenuIterator.next();
            printMenuPosition(menuPosition, i );
            i++;
        }
    }

    private void printMenuPosition(MenuPosition menuPosition, int i) {
        System.out.printf("%d. %-30s : %-80s  : %4.2f  \n", i, menuPosition.getName(), menuPosition.getDescription(), menuPosition.getPrice());
    }

}
