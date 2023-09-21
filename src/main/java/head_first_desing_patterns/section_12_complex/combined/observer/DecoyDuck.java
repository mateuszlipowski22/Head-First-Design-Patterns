package head_first_desing_patterns.section_12_complex.combined.observer;

public class DecoyDuck implements Quacking {
    Subject subject;

    public DecoyDuck() {
        this.subject = new Subject(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
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
