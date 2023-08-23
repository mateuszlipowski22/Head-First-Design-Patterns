package head_first_desing_patterns.section_4_factory_method;

public class AmericanPizzeria extends Pizzeria{

    @Override
    protected Pizza getPizza(String type) {
        Pizza pizza=null;

        switch (type.toLowerCase()){
            case "cheese":
                pizza=new AmericanCheesePizza();
                break;
            case "pepperoni":
                pizza=new AmericanPepperoniPizza();
                break;
            case "seafood":
                pizza=new AmericanSeafoodPizza();
                break;
            case "vege":
                pizza=new AmericanVegePizza();
                break;
        }
        return pizza;
    }
}
