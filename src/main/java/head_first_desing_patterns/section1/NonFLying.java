package head_first_desing_patterns.section1;

public class NonFLying implements FlyingInterface{
    @Override
    public void fly() {
        System.out.println("I am not able to fly");
    }
}
