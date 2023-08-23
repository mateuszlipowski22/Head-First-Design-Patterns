package head_first_desing_patterns.section_3_decorator.star_cafe_2;

public class SoyaMilk extends Drink {

    Drink drink;

    public SoyaMilk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getSize() {
        return drink.getSize();
    }

    public double cost() {
        double cost = drink.cost();
        switch (getSize()) {
            case Drink.SMALL -> cost += 0.10;
            case Drink.MEDIUM -> cost += 0.15;
            case Drink.LARGE -> cost += 0.20;
            default -> cost += 0.15;
        }
        return cost;
    }

    public String getDescription() {
        return drink.getDescription() + ", Milk";
    }
}
