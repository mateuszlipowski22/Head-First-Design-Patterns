package head_first_desing_patterns.template_method.coffee_exapme_with_handler;

public class TestingDrinks {

    public static void main(String[] args) {

        TeaWithHandler tea = new TeaWithHandler();
        tea.brewingRecipe();

        System.out.println("________________________");

        CoffeeWithHandler coffee = new CoffeeWithHandler();
        coffee.brewingRecipe();

    }

}
