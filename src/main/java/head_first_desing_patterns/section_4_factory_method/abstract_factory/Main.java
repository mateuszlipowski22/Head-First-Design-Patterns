package head_first_desing_patterns.section_4_factory_method.abstract_factory;

public class Main {

    public static void main(String[] args) {

        Pizzeria italianPizzeria = new ItalianPizzeria();
        Pizza pizza = italianPizzeria.getPizza("cheese");
        pizza.preparation();
        pizza.baking();
        pizza.cutting();
        pizza.packing();
    }

}
