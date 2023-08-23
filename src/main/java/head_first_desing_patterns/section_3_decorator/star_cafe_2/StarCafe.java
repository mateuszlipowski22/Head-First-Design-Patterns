package head_first_desing_patterns.section_3_decorator.star_cafe_2;

public class StarCafe {

    public static void main(String[] args) {

        Drink drink = new Espresso();
        System.out.println(drink.getDescription() + " " + drink.cost()+ " PLN");

        Drink drink2 = new StrongRoasted();
        drink2.setSize(Drink.LARGE);
        drink2 = new Chocolate(drink2);
        drink2 = new Chocolate(drink2);
        drink2 = new WhippedCream(drink2);
        System.out.println(drink2.getDescription() + " " + drink2.cost()+ " PLN");

        Drink drink3 = new StarCafeSpecial();
        drink3.setSize(Drink.SMALL);
        drink3 = new SoyaMilk(drink3);
        drink3 = new Chocolate(drink3);
        drink3 = new WhippedCream(drink3);
        System.out.println(drink3.getDescription() + " " + drink3.cost()+ " PLN");
    }

}
