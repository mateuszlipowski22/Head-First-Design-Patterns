package head_first_desing_patterns.section_11_proxy.remote_proxy;

import java.util.Random;

public class StatePresenceOfCoin implements State {

    Random randomWin = new Random(System.currentTimeMillis());
    transient VendingMachine vendingMachine;

    public StatePresenceOfCoin(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You cannot insert more coins");
    }

    @Override
    public void returnCoin() {
        System.out.println("The coin is returned");
        vendingMachine.setState(vendingMachine.getStateLackOfCoins());
    }

    @Override
    public void turnTheKnob() {
        System.out.println("You turned the knob");
        int win = randomWin.nextInt(10);
        if(win==0){
            vendingMachine.setState(vendingMachine.getStateWon());
        }else {
            vendingMachine.setState(vendingMachine.getStateSoldGum());
        }
    }

    @Override
    public void givingGum() {
        System.out.println("The gum is not released");
    }
}
