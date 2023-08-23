package head_first_desing_patterns.section_3_decorator.star_cafe_2;

public class Espresso extends Drink {

    public Espresso() {
        description = "Coffee Espresso";
    }

    @Override
    public double cost() {
        return 1.99d;
    }
}
