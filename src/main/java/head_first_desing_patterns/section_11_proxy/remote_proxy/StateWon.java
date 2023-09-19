package head_first_desing_patterns.section_11_proxy.remote_proxy;


public class StateWon implements State {
    transient VendingMachine vendingMachine;

    public StateWon(VendingMachine vendingMachine) {
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
        System.out.println("You have won. Second gum is coming");
        vendingMachine.releaseTheGun();
        if(vendingMachine.getNumberOfGums()==0){
            vendingMachine.setState(vendingMachine.getStateLackOfGums());
        }else {
            vendingMachine.releaseTheGun();
            if(vendingMachine.getNumberOfGums()>0){
                vendingMachine.setState(vendingMachine.getStateLackOfCoins());
            }else {
                System.out.println("The end of gums");
                vendingMachine.setState(vendingMachine.getStateLackOfGums());
            }
        }
    }
}

