package head_first_desing_patterns.section_8_template_method.coffee_example;

public class Coffee extends DrinkWithCaffeine{
    @Override
    protected void addingExtras() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    protected void brewing() {
        System.out.println("Brewing and percolate the coffee through the filter");
    }
}
