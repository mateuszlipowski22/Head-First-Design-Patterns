package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class PilotProgramming {

    public static void main(String[] args) {

        SuperPilotWithUndo superPilot = new SuperPilotWithUndo(7);

        Light kitchenLight = new Light("Kitchen");
        Light livingRoomLight = new Light("Living room");
        GarageDoor garageDoor = new GarageDoor();
        HiFi hiFi = new HiFi();

        CommandTurnOnLight kitchenTurnOnLight = new CommandTurnOnLight(kitchenLight);
        CommandTurnOffLight kitchenTurnOffLight = new CommandTurnOffLight(kitchenLight);
        CommandTurnOnLight livingRoomTurnOnLight = new CommandTurnOnLight(livingRoomLight);
        CommandTurnOffLight livingRoomTurnOffLight = new CommandTurnOffLight(livingRoomLight);

        CommandOpenGarageDoor openGarageDoor = new CommandOpenGarageDoor(garageDoor);
        CommandCloseGarageDoor closeGarageDoor = new CommandCloseGarageDoor(garageDoor);

        CommandHiFiStereoTurnOnCD hiFiStereoTurnOnCD = new CommandHiFiStereoTurnOnCD(hiFi);
        CommandHiFiStereoTurnOffCD hiFiStereoTurnOffCD = new CommandHiFiStereoTurnOffCD(hiFi);

        superPilot.setCommand(0, kitchenTurnOnLight, kitchenTurnOffLight);
        superPilot.setCommand(1, livingRoomTurnOnLight, livingRoomTurnOffLight);
        superPilot.setCommand(2, openGarageDoor, closeGarageDoor);
        superPilot.setCommand(3, hiFiStereoTurnOnCD, hiFiStereoTurnOffCD);

        System.out.println(superPilot);

        superPilot.pressedOnButton(0);
        superPilot.pressedOffButton(0);
        superPilot.pressedUndoButton();
        superPilot.pressedOnButton(1);
        superPilot.pressedOffButton(1);
        superPilot.pressedUndoButton();
        superPilot.pressedOnButton(2);
        superPilot.pressedOffButton(2);
        superPilot.pressedUndoButton();
        superPilot.pressedOnButton(3);
        superPilot.pressedOffButton(3);
        superPilot.pressedUndoButton();

    }

}
