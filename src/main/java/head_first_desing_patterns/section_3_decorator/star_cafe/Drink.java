package head_first_desing_patterns.section_3_decorator.star_cafe;

public abstract class Drink {

    protected String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
