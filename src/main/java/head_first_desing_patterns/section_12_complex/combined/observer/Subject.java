package head_first_desing_patterns.section_12_complex.combined.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements DuckSubject{
    List<Observer> observers = new ArrayList<Observer>();
    DuckSubject duck;

    public Subject(DuckSubject duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(duck);
        }
    }
}
