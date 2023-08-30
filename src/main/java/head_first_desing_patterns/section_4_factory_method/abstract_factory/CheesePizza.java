package head_first_desing_patterns.section_4_factory_method.abstract_factory;

public class CheesePizza extends Pizza{

    PizzaIngredientsFactory pizzaIngredientsFactory;

    public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    @Override
    public void preparation() {
        System.out.println("Preparation of "+ name);
        pastry=pizzaIngredientsFactory.getPastry();
        sauce=pizzaIngredientsFactory.getSauce();
        cheese=pizzaIngredientsFactory.getCheese();
    }
}
