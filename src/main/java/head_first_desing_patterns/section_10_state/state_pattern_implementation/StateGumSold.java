package head_first_desing_patterns.section_10_state.state_pattern_implementation;

public class StateGumSold implements State {

    VendingMachine vendingMachine;

    public StateGumSold(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait for the gum");
    }

    @Override
    public void returnCoin() {
        System.out.println("You cannot return the coin after turning the knob");
    }

    @Override
    public void turnTheKnob() {
        System.out.println("You will not get the second gum");
    }

    @Override
    public void givingGum() {
        vendingMachine.releaseTheGun();
        if(vendingMachine.getNumberOfGums()>0){
            vendingMachine.setState(vendingMachine.getStateLackOfCoins());
        }else {
            vendingMachine.setState(vendingMachine.getStateLackOfGums());
        }
    }
}
