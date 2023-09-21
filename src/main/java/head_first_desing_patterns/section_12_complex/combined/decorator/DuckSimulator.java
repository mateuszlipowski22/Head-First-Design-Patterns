package head_first_desing_patterns.section_12_complex.combined.decorator;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.run();
    }

    private void run() {
        Quacking wildDuck = new QuackCounter(new WildDuck());
        Quacking platypusDuck = new QuackCounter(new PlatypusDuck());
        Quacking rubberDuck = new QuackCounter(new RubberDuck());
        Quacking decoyDuck = new QuackCounter(new DecoyDuck());
        Quacking gooseDuck = new GooseAdapter(new Goose());

        System.out.println("*** Duck Simulator *** \n");

        run(wildDuck);
        run(platypusDuck);
        run(rubberDuck);
        run(decoyDuck);
        run(gooseDuck);

        System.out.println("\nDucks made " + QuackCounter.getQuackNumber() + " quacks");

    }

    private void run(Quacking quacking){
        quacking.quack();
    }

}
