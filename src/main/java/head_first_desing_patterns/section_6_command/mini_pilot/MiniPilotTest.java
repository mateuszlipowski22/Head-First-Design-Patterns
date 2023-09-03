package head_first_desing_patterns.section_6_command.mini_pilot;

public class MiniPilotTest {

    public static void main(String[] args) {

        MiniPilot pilot = new MiniPilot();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        CommandTurnOnLight turnOnLight = new CommandTurnOnLight(light);
        CommandOpenGarageDoor openGarageDoor = new CommandOpenGarageDoor(garageDoor);

        pilot.setSlot(turnOnLight);
        pilot.pressedTheButton();

        pilot.setSlot(openGarageDoor);
        pilot.pressedTheButton();
    }

}
