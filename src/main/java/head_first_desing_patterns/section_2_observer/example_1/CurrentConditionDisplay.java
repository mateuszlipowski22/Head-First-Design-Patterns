package head_first_desing_patterns.section_2_observer.example_1;

public class CurrentConditionDisplay implements Observer, DisplayElement{

    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.subscribeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current weather conditions:");
        System.out.println("Temperature: "+temperature+" C");
        System.out.println("Humidity: "+humidity+" %");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }
}
