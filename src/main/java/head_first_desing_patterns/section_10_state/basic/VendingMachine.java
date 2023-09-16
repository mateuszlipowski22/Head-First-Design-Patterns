package head_first_desing_patterns.section_10_state.basic;

public class VendingMachine {

    final static int LACK_OF_GUMS = 0;
    final static int LACK_OF_COINS = 1;
    final static int PRESENCE_OF_COIN = 2;
    final static int SOLD_GUM = 3;

    int state = LACK_OF_GUMS;
    int numberOfGums=0;

    public VendingMachine(int numberOfGums) {
        this.numberOfGums = numberOfGums;
        if(numberOfGums>0){
            this.state=LACK_OF_COINS;
        }
    }

    public void insertCoin(){
        if(state==PRESENCE_OF_COIN){
            System.out.println("You cannot insert more coins");
        }else if(state==LACK_OF_COINS){
            state=PRESENCE_OF_COIN;
            System.out.println("The coin is inserted");
        }else if(state==LACK_OF_GUMS){
            System.out.println("You cannot insert coin since the vending machine is empty");
        }else if(state==SOLD_GUM){
            System.out.println("Please wait for the gum");
        }
    }

    public void returnCoin(){
        if(state==PRESENCE_OF_COIN){
            state=LACK_OF_COINS;
            System.out.println("The coin is returned");
        }else if(state==LACK_OF_COINS){
            System.out.println("You did not insert the coin");
        }else if(state==LACK_OF_GUMS){
            System.out.println("You did not insert the coin");
        }else if(state==SOLD_GUM){
            System.out.println("You cannot return the coin after turning the knob");
        }
    }

    public void turnTheKnob(){
        if(state==PRESENCE_OF_COIN){
            state=SOLD_GUM;
            System.out.println("You turned the knob");
            givingGum();
        }else if(state==LACK_OF_COINS){
            System.out.println("Before you turn the knob, insert the coin");
        }else if(state==LACK_OF_GUMS){
            System.out.println("The vending machine is empty");
        }else if(state==SOLD_GUM){
            System.out.println("You will not get the second gum");
        }
    }

    public void givingGum(){
        if(state==PRESENCE_OF_COIN){
            System.out.println("The gum is not released");
        }else if(state==LACK_OF_COINS){
            System.out.println("First, insert the coin");
        }else if(state==LACK_OF_GUMS){
            System.out.println("Lack of gums");
        }else if(state==SOLD_GUM){
            System.out.println("The gum is coming");
            numberOfGums--;
            if(numberOfGums==0){
                System.out.println("Lack of gums");
                state=LACK_OF_GUMS;
            }else {
                state=LACK_OF_COINS;
            }
        }
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "state=" + state +
                ", numberOfGums=" + numberOfGums +
                '}';
    }
}
