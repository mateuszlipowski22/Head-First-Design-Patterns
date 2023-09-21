package head_first_desing_patterns.section_12_complex.combined.composite;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Quacking{
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
}
