package head_first_desing_patterns.section_12_complex.mvc.dj_controller;

public class DJTest {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
