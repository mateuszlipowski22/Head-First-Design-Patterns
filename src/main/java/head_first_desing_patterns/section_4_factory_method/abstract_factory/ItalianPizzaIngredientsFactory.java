package head_first_desing_patterns.section_4_factory_method.abstract_factory;

public class ItalianPizzaIngredientsFactory implements PizzaIngredientsFactory{
    @Override
    public Pastry getPastry() {
        return new ThinCrispyPastry();
    }

    @Override
    public Sauce getSauce() {
        return new SauceMarinara();
    }

    @Override
    public Cheese getCheese() {
        return new CheeseReggiano();
    }

    @Override
    public Vegetables[] getVegetables() {
        Vegetables[] vegetables = {new Garlic(), new Onion(), new Mushrooms(), new RedPaprika()};
        return vegetables;
    }

    @Override
    public Pepperoni getPepperoni() {
        return new PepperoniSlices();
    }

    @Override
    public Clams getClams() {
        return new FreshClams();
    }
}
