package head_first_desing_patterns.section_12_complex.combined.composite;

public class DuckFactoryImplWithCounter extends DuckFactory {
    @Override
    public Quacking getWildDuck() {
        return new QuackCounter(new WildDuck());
    }

    @Override
    public Quacking getDecoyDuck() {
        return new QuackCounter(new DecoyDuck());
    }

    @Override
    public Quacking getPlatypusDuck() {
        return new QuackCounter(new PlatypusDuck());
    }

    @Override
    public Quacking getRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
