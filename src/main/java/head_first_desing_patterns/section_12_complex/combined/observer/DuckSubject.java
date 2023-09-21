package head_first_desing_patterns.section_12_complex.combined.observer;

public interface DuckSubject {
    void registerObserver(Observer observer);

    void notifyObservers();
}
