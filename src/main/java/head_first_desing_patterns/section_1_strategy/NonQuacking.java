package head_first_desing_patterns.section_1_strategy;

public class NonQuacking implements QuackingInterface{
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
