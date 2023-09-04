package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Lack of command implementation");
    }

    @Override
    public void undo()  {
        System.out.println("Lack of command implementation");
    }
}
