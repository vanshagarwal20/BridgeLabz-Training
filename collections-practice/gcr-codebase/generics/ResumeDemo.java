package generics;

import java.util.*;

abstract class JobRole {
    abstract String roleName();
}

class SoftwareEngineer extends JobRole {
    String roleName() { return "Software Engineer"; }
}

class DataScientist extends JobRole {
    String roleName() { return "Data Scientist"; }
}

class Resume<T extends JobRole> {
    String candidate;
    T role;

    Resume(String candidate, T role) {
        this.candidate = candidate;
        this.role = role;
    }

    void process() {
        System.out.println(candidate + " applying for " + role.roleName());
    }
}

class ResumeScreening {
    static void screen(List<? extends JobRole> roles) {
        roles.forEach(r -> System.out.println("Screening for " + r.roleName()));
    }
}

public class ResumeDemo {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r =
                new Resume<>("Aman", new SoftwareEngineer());
        r.process();
    }
}

