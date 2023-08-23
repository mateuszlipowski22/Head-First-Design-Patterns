package head_first_desing_patterns.section_4_factory_method;

public class AmericanCheesePizza extends Pizza{

    public AmericanCheesePizza() {
        this.name="American cheese pizza";
        this.dough="Extra thick, extra crispy";
        this.sauce="Tomato sauce";

        this.toppings.add("Mozzarella cheese");
    }

    @Override
    public void cutting() {
        System.out.println("Cutting pizza into square pieces");
    }
}
