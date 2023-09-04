package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class CommandHiFiStereoTurnOffCD implements Command {

    HiFi hiFi;

    @Override
    public void execute() {
        this.hiFi.turnOff();
    }

    @Override
    public void undo() {
        this.hiFi.turnOn();
        this.hiFi.setTheCD();
        this.hiFi.setVolumeTo(11);
    }

    public CommandHiFiStereoTurnOffCD(HiFi hiFi) {
        this.hiFi = hiFi;
    }

}
