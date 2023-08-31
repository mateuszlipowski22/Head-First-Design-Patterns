package head_first_desing_patterns.section_5_singelton.double_lock;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

    }

}
