package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class CommandHiFiStereoTurnOnCD implements Command {

    HiFi hiFi;

    @Override
    public void execute() {
        this.hiFi.turnOn();
        this.hiFi.setTheCD();
        this.hiFi.setVolumeTo(11);
    }

    @Override
    public void undo() {
        this.hiFi.turnOff();
    }

    public CommandHiFiStereoTurnOnCD(HiFi hiFi) {
        this.hiFi = hiFi;
    }

}
