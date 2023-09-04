package head_first_desing_patterns.section_6_command.super_pilot_with_undo;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String localization;
    int speed;

    public CeilingFan(String localization) {
        this.localization = localization;
        this.speed=OFF;
    }

    public int getSpeed() {
        return speed;
    }

    public void highSpeed(){
        speed=HIGH;
        System.out.println(localization + " ceiling fan is on, speed : "+ speed);
    }

    public void mediumSpeed(){
        speed=MEDIUM;
        System.out.println(localization + " ceiling fan is on, speed : "+ speed);
    }

    public void lowSpeed(){
        speed=LOW;
        System.out.println(localization + " ceiling fan is on, speed : "+ speed);
    }

    public void off(){
        speed=OFF;
        System.out.println(localization + " ceiling fan is off");
    }
}
