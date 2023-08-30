package head_first_desing_patterns.section_4_factory_method.abstract_factory;

public class ItalianPizzeria extends Pizzeria{
    @Override
    protected Pizza getPizza(String type) {
        Pizza pizza = null;

        ItalianPizzaIngredientsFactory ingredientsFactory = new ItalianPizzaIngredientsFactory();

        if(type.equals("cheese")){
            pizza=new CheesePizza(ingredientsFactory);
            pizza.setName("Italian cheese pizza");
        }else if(type.equals("seafood")){
            pizza=new SeaFoodPizza(ingredientsFactory);
            pizza.setName("Italian seafood pizza");
        }
        return pizza;
    }
}
