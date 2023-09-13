package head_first_desing_patterns.section_9_iterator_composite.iterator;

import java.util.List;

public class WaitressJava {

    public void printMenu(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<MenuPosition> breakfastPositions = pancakeHouseMenu.getMenuPositions();

        DinnerMenu dinerMenu = new DinnerMenu();
        MenuPosition[] lunchPositions = dinerMenu.getMenuPositions();

        System.out.println("\nMenu śniadaniowe");
        for (int i=0; i < breakfastPositions.size(); i++){
            MenuPosition menuPosition = breakfastPositions.get(i);
            printMenuPosition(menuPosition, i+1);
        }

        System.out.println("\nMenu obiadowe");
        for (int i=0; i < lunchPositions.length; i++){
            if(lunchPositions[i]!=null){
                MenuPosition menuPosition = lunchPositions[i];
                printMenuPosition(menuPosition, i+1);
            }else {
                break;
            }
        }
    }

    private void printMenuPosition(MenuPosition menuPosition, int i) {
        System.out.printf("%d. %-30s : %-80s  : %4.2f  \n", i, menuPosition.getName(), menuPosition.getDescription(), menuPosition.getPrice());
    }

}
