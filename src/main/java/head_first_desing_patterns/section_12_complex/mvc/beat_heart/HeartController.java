package head_first_desing_patterns.section_12_complex.mvc.beat_heart;

import head_first_desing_patterns.section_12_complex.mvc.dj_controller.ControllerInterface;
import head_first_desing_patterns.section_12_complex.mvc.dj_controller.DJView;

public class HeartController implements ControllerInterface {
	HeartModelInterface model;
	DJView view;
  
	public HeartController(HeartModelInterface model) {
		this.model = model;
		view = new DJView( new HeartAdapter(model), this);
        view.createView();
        view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}
  
	public void start() {}
 
	public void stop() {}
    
	public void increaseBPM() {}
    
	public void decreaseBPM() {}
  
 	public void setBPM(int bpm) {}
}


