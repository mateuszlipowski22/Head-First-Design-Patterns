package head_first_desing_patterns.section_12_complex.mvc.beat_heart;

import head_first_desing_patterns.section_12_complex.mvc.dj_controller.ControllerInterface;

public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}