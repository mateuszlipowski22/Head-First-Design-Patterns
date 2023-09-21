package head_first_desing_patterns.section_12_complex.combined.composite;

public class GooseAdapter implements Quacking {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
