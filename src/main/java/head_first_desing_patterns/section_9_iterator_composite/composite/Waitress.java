package head_first_desing_patterns.section_9_iterator_composite.composite;

public class Waitress {

    private MenuElement allMenus;

    public Waitress(MenuElement allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
