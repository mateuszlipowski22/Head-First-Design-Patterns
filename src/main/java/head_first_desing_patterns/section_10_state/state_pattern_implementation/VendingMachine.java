package head_first_desing_patterns.section_10_state.state_pattern_implementation;

public class VendingMachine {

    State stateLackOfGums;
    State stateLackOfCoins;
    State statePresenceOfCoin;
    State stateSoldGum;
    State stateWon;

    State state = stateLackOfGums;
    int numberOfGums = 0;

    public VendingMachine(int numberOfGums) {
        this.stateLackOfGums=new StateLackOfGum(this);
        this.stateLackOfCoins=new StateLackOfCoin(this);
        this.statePresenceOfCoin=new StatePresenceOfCoin(this);
        this.stateSoldGum=new StateGumSold(this);
        this.stateWon=new StateWon(this);

        this.numberOfGums = numberOfGums;
        if (numberOfGums > 0) {
            this.state = stateLackOfCoins;
        }
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void returnCoin() {
        state.returnCoin();
    }

    public void turnTheKnob() {
        state.turnTheKnob();
        state.givingGum();
    }

    public void releaseTheGun() {
        System.out.println("The gum is released");
        if(numberOfGums!=0){
            numberOfGums--;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getStateLackOfGums() {
        return stateLackOfGums;
    }

    public State getStateLackOfCoins() {
        return stateLackOfCoins;
    }

    public State getStatePresenceOfCoin() {
        return statePresenceOfCoin;
    }

    public State getStateSoldGum() {
        return stateSoldGum;
    }

    public int getNumberOfGums() {
        return numberOfGums;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "state=" + state.getClass().getSimpleName() +
                ", numberOfGums=" + numberOfGums +
                '}';
    }

    public State getStateWon() {
        return stateWon;
    }
}