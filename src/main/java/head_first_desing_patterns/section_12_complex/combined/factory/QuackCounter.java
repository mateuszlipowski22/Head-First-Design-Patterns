package head_first_desing_patterns.section_12_complex.combined.factory;

public class QuackCounter implements Quacking {

    private static int quackNumber=0;
    private Quacking duck;

    public QuackCounter(Quacking duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackNumber++;
    }

    public static int getQuackNumber() {
        return quackNumber;
    }
}
