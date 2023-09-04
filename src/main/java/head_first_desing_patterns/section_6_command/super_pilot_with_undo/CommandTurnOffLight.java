package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class CommandTurnOffLight implements Command {

    Light light;

    public CommandTurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }

    @Override
    public void undo() {
        this.light.turnOn();
    }
}
