package lambda_expressions;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String type;

    Alert(String type) {
        this.type = type;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Emergency"),
                new Alert("Routine"),
                new Alert("Medicine Reminder")
        );

        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("Emergency");

        List<Alert> filteredAlerts =
                alerts.stream()
                      .filter(emergencyOnly)
                      .collect(Collectors.toList());

        filteredAlerts.forEach(a -> System.out.println(a.type));
    }
}

