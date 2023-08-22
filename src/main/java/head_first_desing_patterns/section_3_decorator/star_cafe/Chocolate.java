package head_first_desing_patterns.section_3_decorator.star_cafe;

public class Chocolate extends Drink{

    Drink drink;

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    public double cost() {
        return 0.2 + drink.cost();
    }

    public String getDescription() {
        return drink.getDescription() + ", Chocolate";
    }
}
