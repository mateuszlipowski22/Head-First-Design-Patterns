package head_first_desing_patterns.section_12_complex.mvc.beat_heart;

import head_first_desing_patterns.section_12_complex.mvc.dj_controller.BPMObserver;
import head_first_desing_patterns.section_12_complex.mvc.dj_controller.BeatObserver;

public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
}