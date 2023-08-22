package head_first_desing_patterns.section_3_decorator.star_cafe;

public class StarCafeSpecial extends Drink{

    public StarCafeSpecial() {
        description = "Star special coffee";
    }

    @Override
    public double cost() {
        return 0.89d;
    }
}
