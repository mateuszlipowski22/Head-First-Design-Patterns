package head_first_desing_patterns.section_4_factory_method.factory_method;

public class ItalianCheesePizza extends Pizza{

    public ItalianCheesePizza() {
        this.name="Italian cheese pizza with Marinara sauce";
        this.dough="Thin crisp dough";
        this.sauce="Marinara sauce";

        this.toppings.add("Reggiano cheese");
    }
}
