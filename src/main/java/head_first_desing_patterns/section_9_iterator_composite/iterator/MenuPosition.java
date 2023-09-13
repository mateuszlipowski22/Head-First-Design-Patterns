package head_first_desing_patterns.section_9_iterator_composite.iterator;

public class MenuPosition {
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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getPrice() {
        return price;
    }
}
