package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class CommandCeilingFanHigh extends CommandCeilingFan implements Command {


    public CommandCeilingFanHigh(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.highSpeed();
    }
}
