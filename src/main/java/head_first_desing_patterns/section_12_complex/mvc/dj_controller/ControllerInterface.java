package head_first_desing_patterns.section_12_complex.mvc.dj_controller;

public interface ControllerInterface {
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
 	void setBPM(int bpm);
}