package head_first_desing_patterns.template_method.coffee_example;

public class TestingDrinks {

    public static void main(String[] args) {

        Tea tea = new Tea();
        tea.brewingRecipe();

        System.out.println("________________________");

        Coffee coffee = new Coffee();
        coffee.brewingRecipe();

    }

}
