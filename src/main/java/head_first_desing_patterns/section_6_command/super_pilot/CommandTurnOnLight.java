package head_first_desing_patterns.section_6_command.super_pilot;

public class CommandTurnOnLight implements Command {

    Light light;

    @Override
    public void execute() {
        this.light.turnOn();
    }

    public CommandTurnOnLight(Light light) {
        this.light = light;
    }

}
