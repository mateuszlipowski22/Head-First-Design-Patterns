package head_first_desing_patterns.section_12_complex.combined.observer;

public class DuckFactoryImpl extends DuckFactory {
    @Override
    public Quacking getWildDuck() {
        return new WildDuck();
    }

    @Override
    public Quacking getDecoyDuck() {
        return new DecoyDuck();
    }

    @Override
    public Quacking getPlatypusDuck() {
        return new PlatypusDuck();
    }

    @Override
    public Quacking getRubberDuck() {
        return new RubberDuck();
    }
}
