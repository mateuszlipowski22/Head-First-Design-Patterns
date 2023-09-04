package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public abstract class CommandCeilingFan implements Command {

    CeilingFan ceilingFan;
    int previousSpeed;

    public abstract void execute();

    @Override
    public void undo() {
        switch (previousSpeed) {
            case CeilingFan.HIGH -> {
                ceilingFan.highSpeed();
            }
            case CeilingFan.MEDIUM -> {
                ceilingFan.mediumSpeed();
            }
            case CeilingFan.LOW -> {
                ceilingFan.lowSpeed();
            }
            case CeilingFan.OFF -> {
                ceilingFan.off();
            }
        }
    }
}
