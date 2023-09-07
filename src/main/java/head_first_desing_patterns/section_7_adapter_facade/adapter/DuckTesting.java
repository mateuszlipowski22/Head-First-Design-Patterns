package head_first_desing_patterns.section_7_adapter_facade.adapter;

public class DuckTesting {

    public static void main(String[] args) {

        WildDuck duck = new WildDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey:");
        turkey.gobble();
        turkey.fly();
        System.out.println("-----------------------------");

        System.out.println("The duck:");
        duckTesting(duck);

        System.out.println("The turkey adapter:");
        duckTesting(turkeyAdapter);
    }

    private static void duckTesting(Duck duck) {
        duck.quack();
        duck.fly();
        System.out.println("-----------------------------");
    }


}
