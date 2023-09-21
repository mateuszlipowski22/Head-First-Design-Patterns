package head_first_desing_patterns.section_12_complex.combined.observer;

public class WildDuck implements Quacking {
    Subject subject;

    public WildDuck() {
        this.subject = new Subject(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack Quack!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        subject.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        subject.notifyObservers();
    }
}
