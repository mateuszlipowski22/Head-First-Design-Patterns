package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class CommandTurnOnLight implements Command {

    Light light;

    @Override
    public void execute() {
        this.light.turnOn();
    }

    @Override
    public void undo() {
        this.light.turnOff();
    }

    public CommandTurnOnLight(Light light) {
        this.light = light;
    }

}
