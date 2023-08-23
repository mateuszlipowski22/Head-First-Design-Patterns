package head_first_desing_patterns.section_3_decorator.star_cafe_2;

public class Decaffeinated extends Drink {

    public Decaffeinated() {
        description = "Decaffeinated";
    }

    @Override
    public double cost() {
        return 1.05d;
    }
}
