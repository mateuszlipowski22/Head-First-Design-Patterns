package head_first_desing_patterns.section1;

public abstract class Duck {

    FlyingInterface flyingInterface;
    QuackingInterface quackingInterface;

    public Duck() {
    }

    public void executeFly(){
        flyingInterface.fly();
    }

    public void executeQuack(){
        quackingInterface.quack();
    }

    abstract void display();

    public void setFlyingInterface(FlyingInterface flyingInterface) {
        this.flyingInterface = flyingInterface;
    }

    public void setQuackingInterface(QuackingInterface quackingInterface) {
        this.quackingInterface = quackingInterface;
    }
}
