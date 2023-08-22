package head_first_desing_patterns.section_3_decorator.star_cafe;

public class WhippedCream extends Drink{

    Drink drink;

    public WhippedCream(Drink drink) {
        this.drink = drink;
    }

    public double cost() {
        return 0.15 + drink.cost();
    }

    public String getDescription() {
        return drink.getDescription() + ", Milk";
    }
}
