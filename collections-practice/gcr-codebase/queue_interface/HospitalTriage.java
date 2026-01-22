package queue_interface;

import java.util.*;

class Patient {
    private String name;
    private int severity; 

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() { return name; }
    public int getSeverity() { return severity; }

    @Override
    public String toString() {
        return name + "(" + severity + ")";
    }
}

public class HospitalTriage {

    public static void main(String[] args) {

//         Comparator: higher severity treated first
        PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((p1, p2) -> p2.getSeverity() - p1.getSeverity());

//         Add patients
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");

        while (!triageQueue.isEmpty()) {
            Patient next = triageQueue.remove();
            System.out.println(next);
        }
    }
}

