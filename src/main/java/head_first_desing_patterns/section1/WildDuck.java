package head_first_desing_patterns.section1;

public class WildDuck extends Duck{

    public WildDuck() {
        quackingInterface=new Quacking();
        fLyingInterface=new Flying();
    }

    @Override
    void display() {
        System.out.println("I am the real wild duck");
    }
}
