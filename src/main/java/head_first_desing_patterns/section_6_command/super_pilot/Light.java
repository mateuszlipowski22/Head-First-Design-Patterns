package head_first_desing_patterns.section_6_command.super_pilot;

public class Light {

    String room;

    public Light(String room) {
        this.room = room;
    }

    public void turnOn(){
        System.out.println("The light in "+ room +" is turn On ");
    }

    public void turnOff(){
        System.out.println("The light in "+ room +" is turn Off ");
    }
}
