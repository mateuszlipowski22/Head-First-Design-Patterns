package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class PilotProgrammingCeilingFan {

    public static void main(String[] args) {

        SuperPilotWithUndo superPilot = new SuperPilotWithUndo(7);

        CeilingFan ceilingFan = new CeilingFan("Living room");

        CommandCeilingFanHigh commandCeilingFanHigh = new CommandCeilingFanHigh(ceilingFan);
        CommandCeilingFanMedium commandCeilingFanMedium = new CommandCeilingFanMedium(ceilingFan);
        CommandCeilingFanLow commandCeilingFanLow = new CommandCeilingFanLow(ceilingFan);
        CommandCeilingFanOff commandCeilingFanOff = new CommandCeilingFanOff(ceilingFan);

        superPilot.setCommand(0, commandCeilingFanHigh, commandCeilingFanOff);
        superPilot.setCommand(1, commandCeilingFanMedium, commandCeilingFanOff);
        superPilot.setCommand(2, commandCeilingFanLow, commandCeilingFanOff);

        System.out.println(superPilot);

        superPilot.pressedOnButton(0);
        superPilot.pressedUndoButton();
        superPilot.pressedOnButton(1);
        superPilot.pressedOnButton(2);
        superPilot.pressedUndoButton();
        superPilot.pressedOnButton(2);
        superPilot.pressedUndoButton();

    }

}
