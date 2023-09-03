package head_first_desing_patterns.section_6_command.super_pilot;

public class CommandTurnOffLight implements Command {

    Light light;

    public CommandTurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
