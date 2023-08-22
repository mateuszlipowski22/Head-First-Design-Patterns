package head_first_desing_patterns.section_3_decorator.star_cafe;

public class StrongRoasted extends Drink{

    public StrongRoasted() {
        description = "Strong Roasted";
    }

    @Override
    public double cost() {
        return 0.99d;
    }
}
