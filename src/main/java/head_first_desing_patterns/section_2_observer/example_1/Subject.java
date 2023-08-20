package head_first_desing_patterns.section_2_observer.example_1;


public interface Subject {

    void subscribeObserver(Observer observer);
    void unsubscribeObserver(Observer observer);
    void notifyObservers();

}
