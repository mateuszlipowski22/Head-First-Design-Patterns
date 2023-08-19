package head_first_desing_patterns.section1;

public class NonQuacking implements QuackingInterface{
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
