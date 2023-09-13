package head_first_desing_patterns.section_9_iterator_composite.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JacksMenu implements Menu{

    Map<String, MenuPosition> menuPositionMap;

    public JacksMenu() {
        this.menuPositionMap = new HashMap<>();

        addElement("Kanpka wegetarianska z frytkami", "Kanapka wegetarianska z salata i pomdorem, frytki", true, 3.99);
        addElement("Zupa dnia", "Zupa dnia, sałatka", false, 3.69);
        addElement("Burito", "Duże burito z fasolą, sosem salsa i guacamole", true, 4.29);
    }

    public void addElement(String name, String description, boolean isVegetarian, double price) {
        MenuPosition menuPosition = new MenuPosition(name, description, isVegetarian, price);
        menuPositionMap.put(name, menuPosition);
    }

    public Map<String, MenuPosition> getMenuPositionMap() {
        return menuPositionMap;
    }

    @Override
    public Iterator<MenuPosition> getIterator() {
        return menuPositionMap.values().iterator();
    }
}
