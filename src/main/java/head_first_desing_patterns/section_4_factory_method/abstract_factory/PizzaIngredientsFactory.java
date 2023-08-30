package head_first_desing_patterns.section_4_factory_method.abstract_factory;

public interface PizzaIngredientsFactory {
    Pastry getPastry();
    Sauce getSauce();
    Cheese getCheese();
    Vegetables[] getVegetables();
    Pepperoni getPepperoni();
    Clams getClams();
}


