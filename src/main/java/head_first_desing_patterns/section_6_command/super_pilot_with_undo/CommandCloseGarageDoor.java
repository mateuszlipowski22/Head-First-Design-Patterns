package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class CommandCloseGarageDoor implements Command {

    GarageDoor garageDoor;

    public CommandCloseGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
