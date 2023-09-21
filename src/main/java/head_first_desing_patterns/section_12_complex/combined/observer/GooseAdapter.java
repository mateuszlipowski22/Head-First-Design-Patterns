package head_first_desing_patterns.section_12_complex.combined.observer;

public class GooseAdapter implements Quacking {
    Subject subject;

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.subject = new Subject(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
