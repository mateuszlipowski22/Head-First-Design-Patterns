package head_first_desing_patterns.section1;

public class ModelDuck extends Duck{

    public ModelDuck() {
        quackingInterface=new Quacking();
        flyingInterface=new NonFLying();
    }

    @Override
    void display() {
        System.out.println("I am the duck model");
    }
}
