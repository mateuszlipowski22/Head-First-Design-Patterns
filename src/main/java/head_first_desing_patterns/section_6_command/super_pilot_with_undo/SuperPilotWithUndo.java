package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class SuperPilotWithUndo {

    private Command[] commandsOn;
    private Command[] commandsOff;
    private Command undoCommand;

    public SuperPilotWithUndo(int numberOfSlots) {
        this.commandsOn = new Command[numberOfSlots];
        this.commandsOff = new Command[numberOfSlots];

        Command noCommand = new NoCommand();

        for(int i = 0; i<numberOfSlots; i++){
            commandsOn[i]=noCommand;
            commandsOff[i]=noCommand;
        }
        undoCommand=noCommand;
    }

    public void setCommand(int slot, Command commandsOn, Command commandsOff) {
        this.commandsOn[slot] = commandsOn;
        this.commandsOff[slot] = commandsOff;
    }

    public void pressedOnButton(int slot){
        this.commandsOn[slot].execute();
        this.undoCommand=commandsOn[slot];
    }

    public void pressedOffButton(int slot){
        this.commandsOff[slot].execute();
        this.undoCommand=commandsOff[slot];
    }

    public void pressedUndoButton(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n ---------- Super Pilot ---------- \n");
        for (int i = 0; i < commandsOn.length; i++) {
            stringBuffer.append("\n [slot "+i+"] "+commandsOn[i].getClass().getSimpleName() +"    "+commandsOff[i].getClass().getSimpleName() );
        }
        return stringBuffer.toString();
    }
}
