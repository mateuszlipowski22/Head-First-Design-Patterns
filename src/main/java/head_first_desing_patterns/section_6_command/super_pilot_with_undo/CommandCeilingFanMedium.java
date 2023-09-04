package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class CommandCeilingFanMedium extends CommandCeilingFan implements Command {


    public CommandCeilingFanMedium(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.mediumSpeed();
    }
}
