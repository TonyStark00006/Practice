public class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year = 2023;
    boolean isRainyMonth = false;

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays++;
    }
}