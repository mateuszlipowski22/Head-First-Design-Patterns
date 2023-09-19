package head_first_desing_patterns.section_11_proxy.protection_proxy;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class MatrimonialAgencyTest {

    private List<PersonComponent> personDB = new ArrayList<>();

    public static void main(String[] args) {
        MatrimonialAgencyTest test = new MatrimonialAgencyTest();
        test.test();
    }

    public MatrimonialAgencyTest() {
        initializeDB();
    }

    private void initializeDB() {
        personDB.add(new PersonComponentImpl("Jasiu", "male", "football"));
        personDB.add(new PersonComponentImpl("Mietek", "male", "basketball"));
        personDB.add(new PersonComponentImpl("Marysia", "female", "knitting"));
    }

    PersonComponent getFromDB(String name){
        PersonComponent personComponent = null;
        personComponent=personDB.stream().filter(person->person.getName().equals(name)).findFirst().orElseThrow(IllegalArgumentException::new);
        return personComponent;
    }

    private void test() {
        PersonComponent jasiu =getFromDB("Jasiu");
        PersonComponent jasiuProxy = getOwnerProxy(jasiu);
        System.out.println("Name is "+ jasiuProxy.getName()+" with interests "+jasiuProxy.getInterests());
        jasiuProxy.setInterests("MMA");
        System.out.println("Name is "+ jasiuProxy.getName()+" with interests "+jasiuProxy.getInterests());
        
        try{
            jasiuProxy.setBeautyRanking(5);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Name is "+ jasiuProxy.getName()+" with ranking "+jasiuProxy.getBeautyRanking());

        PersonComponent mieciu =getFromDB("Mietek");
        PersonComponent mieciuProxy = getNonOwnerProxy(mieciu);
        System.out.println("Name is "+ mieciuProxy.getName()+" with interests "+mieciuProxy.getInterests());
        mieciuProxy.setInterests("MMA");
        System.out.println("Name is "+ mieciuProxy.getName()+" with interests "+mieciuProxy.getInterests());

        try{
            mieciuProxy.setBeautyRanking(5);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Name is "+ mieciuProxy.getName()+" with ranking "+mieciuProxy.getBeautyRanking());


    }

    PersonComponent getOwnerProxy(PersonComponent person){
        return (PersonComponent) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new InvocationHandlerOwner(person));
    }

    PersonComponent getNonOwnerProxy(PersonComponent person){
        return (PersonComponent) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new InvocationHandlerNonOwner(person));
    }

}
