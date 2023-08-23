package head_first_desing_patterns.section_3_decorator.star_cafe_2;

public class Milk extends Drink {


    Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    public double cost() {
        return 0.1 + drink.cost();
    }

    public String getDescription() {
        return drink.getDescription() + ", Milk";
    }
}
