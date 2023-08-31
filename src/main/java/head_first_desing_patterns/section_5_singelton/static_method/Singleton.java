package head_first_desing_patterns.section_5_singelton.static_method;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance(){

        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return  uniqueInstance;
    }

}
