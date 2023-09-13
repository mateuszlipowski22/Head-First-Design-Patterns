package head_first_desing_patterns.section_9_iterator_composite.iterator;

public class DinnerMenu {
    static final int MAX_NUMBER_OF_ELEMENTS=6;
    int numberOfElement=0;
    private MenuPosition[] menuPositions;

    public DinnerMenu() {
        menuPositions=new MenuPosition[MAX_NUMBER_OF_ELEMENTS];

        addElement("Wegetarianska kanapka BSP", "(Wegetarianski) boczek z sałata i pomidorem, chleb pszenny pełnoziarnisty", true, 2.99);
        addElement("Kanapka BSP", "Boczek z sałata i pomidorem, chleb pszenny pełnoziarnisty", true, 2.99);
        addElement("Zupa dnia", "Zupa dnia i sałatka z pomidora", false, 3.29);
        addElement("Hot-dog", "Hot-dog z kiszoną kapustą, rzodkiewką, cebulą i dodatkiem sera", false, 3.05);

    }

    public void addElement(String name, String description, boolean isVegetarian, double price) {
        MenuPosition menuPosition = new MenuPosition(name, description, isVegetarian, price);
        if(numberOfElement>=MAX_NUMBER_OF_ELEMENTS){
            System.out.println("Niestety, menu jest pełne. Nie możemy dodać nowej pozycji");
        }else {
            menuPositions[numberOfElement]=menuPosition;
            numberOfElement++;
        }
    }

    public MenuPosition[] getMenuPositions() {
        return menuPositions;
    }
}
