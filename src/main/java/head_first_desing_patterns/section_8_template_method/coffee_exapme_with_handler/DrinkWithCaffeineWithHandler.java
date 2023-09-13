package head_first_desing_patterns.section_8_template_method.coffee_exapme_with_handler;

public abstract class DrinkWithCaffeineWithHandler {

    public final void brewingRecipe(){
        boilingWater();
        brewing();
        fillingTheCup();
        if(customerWantsExtras()){
            addingExtras();
        }
    }

    protected boolean customerWantsExtras() {
        return true;
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
