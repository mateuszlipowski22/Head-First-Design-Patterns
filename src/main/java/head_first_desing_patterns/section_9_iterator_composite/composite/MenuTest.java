package head_first_desing_patterns.section_9_iterator_composite.composite;

public class MenuTest {

    public static void main(String[] args) {

        MenuElement pancakeHouseMenu = new Menu("MENU PANCAKE HOUSE", "Śniadania");
        MenuElement dinerMenu = new Menu("MENU RESTAURACJI DINER", "Lunch");
        MenuElement jacksMenu = new Menu("MENU U JACKA", "Obiady");
        MenuElement dessertMenu = new Menu("MENU DESEROW", "Desery oczywiście");

        MenuElement allMenus = new Menu("Wszystkie Menu", "Połaczone menu");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(jacksMenu);

        jacksMenu.add(dessertMenu);

        dinerMenu.add(new MenuPosition("Wegetarianska kanapka BSP", "(Wegetarianski) boczek z sałata i pomidorem, chleb pszenny pełnoziarnisty", true, 2.99));
        dinerMenu.add(new MenuPosition("Kanapka BSP", "Boczek z sałata i pomidorem, chleb pszenny pełnoziarnisty", true, 2.99));
        dinerMenu.add(new MenuPosition("Zupa dnia", "Zupa dnia i sałatka z pomidora", false, 3.29));
        dinerMenu.add(new MenuPosition("Hot-dog", "Hot-dog z kiszoną kapustą, rzodkiewką, cebulą i dodatkiem sera", false, 3.05));

        pancakeHouseMenu.add(new MenuPosition("Śniadanie naleśnikowe K&B", "Naleśniki z jajkiem i tostem", true, 2.99));
        pancakeHouseMenu.add(new MenuPosition("Śniadanie naleśnikowe zwykłe", "Naleśniki z jajkiem sadzonym i kiełbasą", true, 2.99));
        pancakeHouseMenu.add(new MenuPosition("Śniadanie z jagodami", "Naleśniki ze świeżymi jagodami", true, 3.49));
        pancakeHouseMenu.add(new MenuPosition("Waæle nadziewane", "Wafle z jagodami lub truskawkami", true, 3.59));

        jacksMenu.add(new MenuPosition("Kanpka wegetarianska z frytkami", "Kanapka wegetarianska z salata i pomdorem, frytki", true, 3.99));
        jacksMenu.add(new MenuPosition("Zupa dnia", "Zupa dnia, sałatka", false, 3.69));
        jacksMenu.add(new MenuPosition("Burito", "Duże burito z fasolą, sosem salsa i guacamole", true, 4.29));

        dessertMenu.add(new MenuPosition("Szarlotka", "Szarlotka z lodami", true, 1.59));
        dessertMenu.add(new MenuPosition("Sernik", "SSernik nowojorski w polewie czekoladowe", true, 1.99));
        dessertMenu.add(new MenuPosition("Sorbet", "Poziomki z limonką", true, 1.89));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
