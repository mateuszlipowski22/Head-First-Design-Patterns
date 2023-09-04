package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class HiFi {
    public void turnOn() {
        System.out.println("The Hi-Fi Stereo is turned On");
    }

    public void setTheCD() {
        System.out.println("CD is set");
    }

    public void setVolumeTo(int i) {
        System.out.println("Volume is set to "+i);
    }

    public void turnOff() {
        System.out.println("The Hi-Fi Stereo is turned Off");
    }
}
