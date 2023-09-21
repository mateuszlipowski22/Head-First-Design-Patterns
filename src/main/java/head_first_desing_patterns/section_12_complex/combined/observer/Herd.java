package head_first_desing_patterns.section_12_complex.combined.observer;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Quacking {
    private List<Quacking> birds = new ArrayList<>();

    public void add(Quacking quacking){
        birds.add(quacking);
    }

    @Override
    public void quack() {
        for(Quacking bird : birds){
            bird.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for(Quacking bird : birds){
            bird.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }
}
