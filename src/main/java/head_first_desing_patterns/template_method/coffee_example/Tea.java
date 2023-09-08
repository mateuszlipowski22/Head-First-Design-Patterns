package head_first_desing_patterns.template_method.coffee_example;

public class Tea extends DrinkWithCaffeine{
    @Override
    protected void addingExtras() {
        System.out.println("Adding the lemon");
    }

    @Override
    protected void brewing() {
        System.out.println("Adding the tea bag");
    }
}
