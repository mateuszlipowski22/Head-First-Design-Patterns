package head_first_desing_patterns.section_2_observer;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        System.out.println();
        weatherData.setReadings(32.2f, 30, 1012);
        System.out.println();
        weatherData.setReadings(33.2f, 32, 1015);
        System.out.println();
        weatherData.setReadings(30.2f, 40, 1022);

    }

}
