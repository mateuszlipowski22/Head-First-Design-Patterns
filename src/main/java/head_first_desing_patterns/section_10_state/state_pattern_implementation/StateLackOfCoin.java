package head_first_desing_patterns.section_10_state.state_pattern_implementation;

public class StateLackOfCoin implements State{

    VendingMachine vendingMachine;

    public StateLackOfCoin(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("The coin is inserted");
        vendingMachine.setState(vendingMachine.getStatePresenceOfCoin());
    }

    @Override
    public void returnCoin() {
        System.out.println("You did not insert the coin");
    }

    @Override
    public void turnTheKnob() {
        System.out.println("Before you turn the knob, insert the coin");
    }

    @Override
    public void givingGum() {
        System.out.println("First, insert the coin");
    }
}
