package head_first_desing_patterns.section_9_iterator_composite.iterator;

public class MainIterator {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        JacksMenu jacksMenu = new JacksMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu,jacksMenu );
        waitress.printMenu();
    }

}
