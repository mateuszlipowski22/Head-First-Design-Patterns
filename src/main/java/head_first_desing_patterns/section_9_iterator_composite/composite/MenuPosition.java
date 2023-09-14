package head_first_desing_patterns.section_9_iterator_composite.composite;

public class MenuPosition extends MenuElement{
    private String name;
    private String description;
    private boolean isVegetarian;
    private double price;

    public MenuPosition(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
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
    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.printf("%-35s %s : %-80s  : %4.2f  \n", this.getName(), isVegetarian ? "(w)":"" , this.getDescription(), this.getPrice());
    }
}
