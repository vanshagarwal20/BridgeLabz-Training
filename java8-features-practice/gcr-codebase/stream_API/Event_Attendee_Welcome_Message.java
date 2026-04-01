package stream_API;

import java.util.*;

public class Event_Attendee_Welcome_Message {
    public static void main(String[] args) {

        List<String> attendees = List.of("Vansh", "Amit", "Rohit");

        attendees.forEach(name ->
            System.out.println("Welcome, " + name + "!")
        );
    }
}
