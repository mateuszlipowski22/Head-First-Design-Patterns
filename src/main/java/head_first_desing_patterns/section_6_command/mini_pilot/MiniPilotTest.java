package head_first_desing_patterns.section_6_command.mini_pilot;

public class MiniPilotTest {

    public static void main(String[] args) {

        MiniPilot pilot = new MiniPilot();
        Light light = new Light();
        CommandTurnOnLight turnOnLight = new CommandTurnOnLight(light);

        pilot.setSlot(turnOnLight);
        pilot.pressedTheButton();
    }

}
