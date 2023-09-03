package head_first_desing_patterns.section_5_singelton.bill_pugh;

public class Main {

    public static void main(String[] args) {

        BillPughSingleton singleton = BillPughSingleton.getInstance();
        System.out.println(singleton);

        BillPughSingleton singleton1 = BillPughSingleton.getInstance();
        System.out.println(singleton1);

    }

}
