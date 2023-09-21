package head_first_desing_patterns.section_12_complex.combined.observer;

public class QuackOLog implements Observer{
    @Override
    public void update(DuckSubject duck) {
        System.out.println("Quack-o-log: "+duck.getClass().getSimpleName()+" quacked.");
    }
}
