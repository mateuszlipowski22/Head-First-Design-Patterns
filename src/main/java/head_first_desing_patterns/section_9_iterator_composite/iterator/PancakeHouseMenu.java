package head_first_desing_patterns.section_9_iterator_composite.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    private List<MenuPosition> menuPositions;

    public PancakeHouseMenu() {
        this.menuPositions = new ArrayList<>();

        addElement("Śniadanie naleśnikowe K&B", "Naleśniki z jajkiem i tostem", true, 2.99);
        addElement("Śniadanie naleśnikowe zwykłe", "Naleśniki z jajkiem sadzonym i kiełbasą", true, 2.99);
        addElement("Śniadanie z jagodami", "Naleśniki ze świeżymi jagodami", true, 3.49);
        addElement("Waæle nadziewane", "Wafle z jagodami lub truskawkami", true, 3.59);

    }

    public void addElement(String name, String description, boolean isVegetarian, double price) {
        MenuPosition menuPosition = new MenuPosition(name, description, isVegetarian, price);
        menuPositions.add(menuPosition);
    }

    public List<MenuPosition> getMenuPositions() {
        return menuPositions;
    }

    public Iterator<MenuPosition> getIterator(){
        return new PancakeHouseMenuIterator(menuPositions);
    }
}
