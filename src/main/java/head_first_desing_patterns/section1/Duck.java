package head_first_desing_patterns.section1;

public abstract class Duck {

    FlyingInterface fLyingInterface;
    QuackingInterface quackingInterface;

    public Duck() {
    }

    public void executeFly(){
        fLyingInterface.fly();
    }

    public void executeQuack(){
        quackingInterface.quack();
    }

    abstract void display();
}
