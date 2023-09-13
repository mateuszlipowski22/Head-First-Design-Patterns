package head_first_desing_patterns.section_8_template_method.coffee_example;

public abstract class DrinkWithCaffeine {

    public final void brewingRecipe(){
        boilingWater();
        brewing();
        fillingTheCup();
        addingExtras();
    }

    protected abstract void addingExtras();

    private void fillingTheCup() {
        System.out.println("Filling the cup");
    }

    protected abstract void brewing();

    private void boilingWater() {
        System.out.println("Boiling the water");
    }

}
