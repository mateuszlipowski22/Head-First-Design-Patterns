package head_first_desing_patterns.section_7_adapter_facade.adapter;

public class WildDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack quack");
    }

    @Override
    public void fly() {
        System.out.println("OMG I am flying");
    }
}
