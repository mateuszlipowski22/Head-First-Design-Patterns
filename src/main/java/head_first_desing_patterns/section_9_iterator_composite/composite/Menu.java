package head_first_desing_patterns.section_9_iterator_composite.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuElement {

    private List<MenuElement> menuElements = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void add(MenuElement menuElement) {
        menuElements.add(menuElement);
    }

    @Override
    public void delete(MenuElement menuElement) {
        menuElements.remove(menuElement);
    }

    @Override
    public MenuElement getChild(int i) {
        return menuElements.get(i);
    }

    @Override
    public void print() {
        System.out.printf("%-35s : %-80s\n", this.getName(), this.getDescription());

        Iterator<MenuElement> iterator = menuElements.iterator();
        while (iterator.hasNext()){
            MenuElement menuElement = iterator.next();
            menuElement.print();
        }
    }

    @Override
    public Iterator<MenuElement> getIterator() {
        return new CompositeIterator(menuElements.iterator());
    }
}
