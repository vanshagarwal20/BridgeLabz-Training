package stream_API;

import java.util.*;

public class IoT_Sensor_Readings {
    public static void main(String[] args) {

        List<Integer> readings = List.of(30, 55, 70, 40);
        int threshold = 50;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("Alert: " + r));
    }
}

