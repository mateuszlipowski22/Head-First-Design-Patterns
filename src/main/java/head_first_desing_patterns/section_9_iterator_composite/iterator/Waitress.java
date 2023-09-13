package head_first_desing_patterns.section_9_iterator_composite.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    private List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> iteratorMenu = menus.iterator();
        while (iteratorMenu.hasNext()){
            Menu menu = iteratorMenu.next();
            System.out.println("\nMenu "+menu.getClass().getSimpleName().replaceAll("Menu", ""));
            printMenu(menu.getIterator());
        }
    }

    private void printMenu(Iterator<MenuPosition> iterator) {
        int i=1;
        while(iterator.hasNext()){
            MenuPosition menuPosition = iterator.next();
            printMenuPosition(menuPosition, i );
            i++;
        }
    }

    private void printMenuPosition(MenuPosition menuPosition, int i) {
        System.out.printf("%d. %-35s : %-80s  : %4.2f  \n", i, menuPosition.getName(), menuPosition.getDescription(), menuPosition.getPrice());
    }

}
