package head_first_desing_patterns.section_4_factory_method.factory_method;

public class PizzaTest {

    public static void main(String[] args) {

        Pizzeria italian = new ItalianPizzeria();
        Pizzeria american = new AmericanPizzeria();

        Pizza pizza = italian.orderPizza("cheese");
        System.out.println("Eryk ordered "+pizza.getName());

        pizza = american.orderPizza("cheese");
        System.out.println("Eryk ordered "+pizza.getName());
    }

}
