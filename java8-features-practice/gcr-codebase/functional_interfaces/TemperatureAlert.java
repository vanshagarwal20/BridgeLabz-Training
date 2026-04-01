package functional_interfaces;

import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        // Predicate to check high temperature
        Predicate<Double> isHighTemperature = temp -> temp > 40;

        double currentTemp = 45;

        if (isHighTemperature.test(currentTemp)) {
            System.out.println("⚠ Alert! Temperature is too high: " + currentTemp);
        } else {
            System.out.println("Temperature is normal");
        }
    }
}

