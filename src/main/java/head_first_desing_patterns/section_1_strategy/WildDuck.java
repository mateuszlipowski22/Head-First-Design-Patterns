package head_first_desing_patterns.section_1_strategy;

public class WildDuck extends Duck{

    public WildDuck() {
        quackingInterface=new Quacking();
        flyingInterface=new Flying();
    }

    @Override
    void display() {
        System.out.println("I am the real wild duck");
    }
}
