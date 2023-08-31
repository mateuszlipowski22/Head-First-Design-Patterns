package head_first_desing_patterns.section_5_singelton.static_initialization;

public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return  uniqueInstance;
    }

}
