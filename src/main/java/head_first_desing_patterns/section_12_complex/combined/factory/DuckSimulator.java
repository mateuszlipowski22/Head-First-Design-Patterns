package head_first_desing_patterns.section_12_complex.combined.factory;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        DuckFactoryImplWithCounter duckFactory = new DuckFactoryImplWithCounter();
        duckSimulator.run(duckFactory);
    }

    private void run(DuckFactory duckFactory) {
        Quacking wildDuck = duckFactory.getWildDuck();
        Quacking platypusDuck = duckFactory.getPlatypusDuck();
        Quacking rubberDuck = duckFactory.getRubberDuck();
        Quacking decoyDuck = duckFactory.getDecoyDuck();
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
