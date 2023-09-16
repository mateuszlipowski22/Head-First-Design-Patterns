package head_first_desing_patterns.section_10_state.state_pattern_implementation;

public class StateLackOfGum implements State {

    VendingMachine vendingMachine;

    public StateLackOfGum(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You cannot insert coin since the vending machine is empty");
    }

    @Override
    public void returnCoin() {
        System.out.println("You did not insert the coin");
    }

    @Override
    public void turnTheKnob() {
        System.out.println("The vending machine is empty");
    }

    @Override
    public void givingGum() {
        System.out.println("Lack of gums");
    }
}
