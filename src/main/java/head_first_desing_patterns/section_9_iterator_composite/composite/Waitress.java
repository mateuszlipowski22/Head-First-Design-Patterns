package head_first_desing_patterns.section_9_iterator_composite.composite;


import java.util.Iterator;

public class Waitress {

    private MenuElement allMenus;

    public Waitress(MenuElement allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator<MenuElement> iterator = allMenus.getIterator();
        System.out.println("\nWszystkie menu\n");

        while (iterator.hasNext()){
            MenuElement menuElement=(MenuElement) iterator.next();
            try{
                if(menuElement.isVegetarian()){
                    menuElement.print();
                }
            }catch (UnsupportedOperationException e){}
        }
    }
}
