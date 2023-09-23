package head_first_desing_patterns.section_12_complex.mvc.dj_controller;

public interface BeatModelInterface {
    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();

    void registerObserver(BeatObserver beatObserver);
    void unRegisterObserver(BeatObserver beatObserver);

    void registerObserver(BPMObserver bpmObservere);
    void unRegisterObserver(BPMObserver bpmObservere);
}
