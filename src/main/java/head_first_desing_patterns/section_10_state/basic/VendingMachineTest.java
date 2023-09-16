package head_first_desing_patterns.section_10_state.basic;

public class VendingMachineTest {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);

        System.out.println(vendingMachine);

        vendingMachine.insertCoin();
        vendingMachine.turnTheKnob();

        System.out.println(vendingMachine);

        vendingMachine.insertCoin();
        vendingMachine.returnCoin();
        vendingMachine.turnTheKnob();

        System.out.println(vendingMachine);

        vendingMachine.insertCoin();
        vendingMachine.turnTheKnob();
        vendingMachine.insertCoin();
        vendingMachine.turnTheKnob();
        vendingMachine.returnCoin();

        System.out.println(vendingMachine);

        vendingMachine.insertCoin();
        vendingMachine.insertCoin();
        vendingMachine.turnTheKnob();
        vendingMachine.insertCoin();
        vendingMachine.turnTheKnob();
        vendingMachine.insertCoin();
        vendingMachine.turnTheKnob();
    }

}
