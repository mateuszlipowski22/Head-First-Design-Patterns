package head_first_desing_patterns.section_6_command.mini_pilot;

public class MiniPilot {

    Command slot;

    public MiniPilot() {}

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void pressedTheButton(){
        slot.execute();
    }
}
