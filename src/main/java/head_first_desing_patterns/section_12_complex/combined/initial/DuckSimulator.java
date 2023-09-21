package head_first_desing_patterns.section_12_complex.combined.initial;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.run();
    }

    private void run() {
        Quacking wildDuck = new WildDuck();
        Quacking platypusDuck = new PlatypusDuck();
        Quacking rubberDuck = new RubberDuck();
        Quacking decoyDuck = new DecoyDuck();

        System.out.println("*** Duck Simulator ***");

        run(wildDuck);
        run(platypusDuck);
        run(rubberDuck);
        run(decoyDuck);
    }

    private void run(Quacking quacking){
        quacking.quack();
    }

}
