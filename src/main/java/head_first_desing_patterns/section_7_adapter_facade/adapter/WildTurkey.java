package head_first_desing_patterns.section_7_adapter_facade.adapter;

public class WildTurkey implements Turkey {


    @Override
    public void gobble() {
        System.out.println("Gulgulgulgulgul");
    }

    @Override
    public void fly() {
        System.out.println("OMG I am flying.... but only on short distances");
    }
}
