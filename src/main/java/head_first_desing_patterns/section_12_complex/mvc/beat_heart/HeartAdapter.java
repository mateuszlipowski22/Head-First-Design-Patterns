package head_first_desing_patterns.section_12_complex.mvc.beat_heart;

import head_first_desing_patterns.section_12_complex.mvc.dj_controller.BPMObserver;
import head_first_desing_patterns.section_12_complex.mvc.dj_controller.BeatModelInterface;
import head_first_desing_patterns.section_12_complex.mvc.dj_controller.BeatObserver;

public class HeartAdapter implements BeatModelInterface {
	HeartModelInterface heart;
 
	public HeartAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}

    public void initialize() {}
  
    public void on() {}
  
    public void off() {}
   
	public int getBPM() {
		return heart.getHeartRate();
	}
  
    public void setBPM(int bpm) {}
   
	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}

	@Override
	public void unRegisterObserver(BeatObserver beatObserver) {
		heart.removeObserver(beatObserver);
	}
     
	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}

	@Override
	public void unRegisterObserver(BPMObserver bpmObservere) {
		heart.removeObserver(bpmObservere);

	}

}