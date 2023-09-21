package head_first_desing_patterns.section_12_complex.combined.composite;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        DuckFactoryImplWithCounter duckFactory = new DuckFactoryImplWithCounter();
        duckSimulator.run(duckFactory);
    }

    private void run(DuckFactory duckFactory) {
        Quacking platypusDuck = duckFactory.getPlatypusDuck();
        Quacking rubberDuck = duckFactory.getRubberDuck();
        Quacking decoyDuck = duckFactory.getDecoyDuck();
        Quacking gooseDuck = new GooseAdapter(new Goose());

        System.out.println("*** Duck Simulator with composite pattern*** \n");

        Herd duckHerd = new Herd();
        duckHerd.add(gooseDuck);
        duckHerd.add(platypusDuck);
        duckHerd.add(rubberDuck);
        duckHerd.add(decoyDuck);

        Herd wildDucks = new Herd();

        Quacking wildDuck1 = duckFactory.getWildDuck();
        Quacking wildDuck2 = duckFactory.getWildDuck();
        Quacking wildDuck3 = duckFactory.getWildDuck();
        Quacking wildDuck4 = duckFactory.getWildDuck();

        wildDucks.add(wildDuck1);
        wildDucks.add(wildDuck2);
        wildDucks.add(wildDuck3);
        wildDucks.add(wildDuck4);

        duckHerd.add(wildDucks);
        System.out.println("\n*** Duck Simulator - whole herd***");
        run(duckHerd);

        System.out.println("\n*** Duck Simulator - herd of wild ducks***");
        run(wildDucks);

        System.out.println("\nDucks made " + QuackCounter.getQuackNumber() + " quacks");

    }

    private void run(Quacking quacking){
        quacking.quack();
    }

}
