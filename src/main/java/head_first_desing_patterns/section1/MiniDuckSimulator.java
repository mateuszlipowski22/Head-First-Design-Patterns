package head_first_desing_patterns.section1;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        wildDuck.executeFly();
        wildDuck.executeQuack();
        wildDuck.display();
    }
}
