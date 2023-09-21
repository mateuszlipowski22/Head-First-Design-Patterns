package head_first_desing_patterns.section_12_complex.combined.observer;

public class RubberDuck implements Quacking {

    Subject subject;

    public RubberDuck() {
        this.subject = new Subject(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak!");
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
