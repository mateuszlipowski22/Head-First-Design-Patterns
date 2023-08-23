package head_first_desing_patterns.section_3_decorator.star_cafe_2;

public abstract class Drink {

    public static final String SMALL="SMALL";
    public static final String MEDIUM="MEDIUM";
    public static final String LARGE="LARGE";

    protected String description;

    protected String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
