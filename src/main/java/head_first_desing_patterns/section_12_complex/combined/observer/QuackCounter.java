package head_first_desing_patterns.section_12_complex.combined.observer;

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

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
