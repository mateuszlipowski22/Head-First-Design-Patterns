package head_first_desing_patterns.section_12_complex.model2;

import head_first_desing_patterns.section_12_complex.mvc.dj_controller.BPMObserver;
import head_first_desing_patterns.section_12_complex.mvc.dj_controller.BeatModelInterface;
import head_first_desing_patterns.section_12_complex.mvc.dj_controller.BeatObserver;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, MetaEventListener{

    Sequencer sequencer;
    List<BeatObserver> beatObserverList = new ArrayList<BeatObserver>();
    List<BPMObserver> bpmObserverList = new ArrayList<BPMObserver>();
    int bpm=90;

    Sequence sequence;
    Track track;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm=bpm;
        sequencer.setTempoInBPM(getBPM());
        notifyBPMObservers();
    }

    void beatEvent() {
        notifyBeatObservers();
    }

    @Override
    public int getBPM() {
        return this.bpm;
    }

    @Override
    public void registerObserver(BeatObserver beatObserver) {
        this.beatObserverList.add(beatObserver);
    }

    @Override
    public void unRegisterObserver(BeatObserver beatObserver) {
        this.beatObserverList.remove(beatObserver);
    }

    @Override
    public void registerObserver(BPMObserver bpmObserver) {
        this.bpmObserverList.add(bpmObserver);
    }

    @Override
    public void unRegisterObserver(BPMObserver bpmObserver) {
        this.bpmObserverList.remove(bpmObserver);
    }

    public void notifyBeatObservers() {
        for(int i = 0; i < beatObserverList.size(); i++) {
            BeatObserver observer = beatObserverList.get(i);
            observer.updateBeat();
        }
    }

    public void notifyBPMObservers() {
        for(int i = 0; i < bpmObserverList.size(); i++) {
            BPMObserver observer = bpmObserverList.get(i);
            observer.updateBPM();
        }
    }


    public void meta(MetaMessage message) {
        if (message.getType() == 47) {
            beatEvent();
            sequencer.start();
            setBPM(getBPM());
        }
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void buildTrackAndStart() {
        int[] trackList = {35, 0, 46, 0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);
        track.add(makeEvent(192,9,1,0,4));
        try {
            sequencer.setSequence(sequence);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void makeTracks(int[] list) {

        for (int i = 0; i < list.length; i++) {
            int key = list[i];

            if (key != 0) {
                track.add(makeEvent(144,9,key, 100, i));
                track.add(makeEvent(128,9,key, 100, i+1));
            }
        }
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);

        } catch(Exception e) {
            e.printStackTrace();
        }
        return event;
    }

}
