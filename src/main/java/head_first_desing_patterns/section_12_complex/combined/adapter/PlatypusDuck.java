package head_first_desing_patterns.section_12_complex.combined.adapter;

public class PlatypusDuck implements Quacking {
    @Override
    public void quack() {
        System.out.println("Quack Quack!");
    }
}
