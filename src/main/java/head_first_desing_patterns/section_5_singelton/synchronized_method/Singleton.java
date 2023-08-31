package head_first_desing_patterns.section_5_singelton.synchronized_method;

public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance(){

        if(uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return  uniqueInstance;
    }

}
