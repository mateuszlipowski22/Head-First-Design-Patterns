package head_first_desing_patterns.section_4_factory_method.factory_method;

public class ItalianPizzeria extends Pizzeria{
    @Override
    protected Pizza getPizza(String type) {
        Pizza pizza=null;

        switch (type.toLowerCase()){
            case "cheese":
                pizza=new ItalianCheesePizza();
                break;
            case "pepperoni":
                pizza=new ItalianPepperoniPizza();
                break;
            case "seafood":
                pizza=new ItalianSeafoodPizza();
                break;
            case "vege":
                pizza=new ItalianVegePizza();
                break;
        }
        return pizza;
    }
}
