package stream_API;

import java.util.*;

class Doctor {
    String name, specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }
}

public class Doctor_API {
    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
            new Doctor("Dr A", "Cardiology", true),
            new Doctor("Dr B", "Orthopedics", false),
            new Doctor("Dr C", "Neurology", true)
        );

        doctors.stream()
               .filter(d -> d.weekendAvailable)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(d -> System.out.println(d.name + " - " + d.specialty));
    }
}

