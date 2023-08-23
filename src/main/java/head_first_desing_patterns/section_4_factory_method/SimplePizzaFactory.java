package head_first_desing_patterns.section_4_factory_method;

public class SimplePizzaFactory {

    public Pizza getPizza(String type){
        Pizza pizza=null;

        switch (type.toUpperCase()){
            case "cheese":
                pizza=new CheesePizza();
                break;
            case "pepperoni":
                pizza=new PepperoniPizza();
                break;
            case "seafood":
                pizza=new SeafoodPizza();
                break;
            case "vege":
                pizza=new VegePizza();
                break;
        }
        return pizza;
    }

}
