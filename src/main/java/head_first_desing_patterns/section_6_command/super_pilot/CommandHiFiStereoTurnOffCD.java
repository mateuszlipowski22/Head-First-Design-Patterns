package head_first_desing_patterns.section_6_command.super_pilot;

public class CommandHiFiStereoTurnOffCD implements Command {

    HiFi hiFi;

    @Override
    public void execute() {
        this.hiFi.turnOff();
    }

    public CommandHiFiStereoTurnOffCD(HiFi hiFi) {
        this.hiFi = hiFi;
    }

}
