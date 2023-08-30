package head_first_desing_patterns.section_4_factory_method.factory_method;

public abstract class Pizzeria {

    public Pizza orderPizza(String type){

        Pizza pizza = getPizza(type);

        pizza.preparation();
        pizza.baking();
        pizza.cutting();
        pizza.packing();

        return pizza;

    }

    protected abstract Pizza getPizza(String type);
}
