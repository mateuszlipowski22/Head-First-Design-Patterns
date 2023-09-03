package head_first_desing_patterns.section_6_command.mini_pilot;

public class CommandOpenGarageDoor implements Command{

    GarageDoor garageDoor;

    public CommandOpenGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.Up();
    }
}
