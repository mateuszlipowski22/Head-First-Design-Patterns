package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class CommandOpenGarageDoor implements Command {

    GarageDoor garageDoor;

    public CommandOpenGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo()  {
        garageDoor.down();
    }
}
