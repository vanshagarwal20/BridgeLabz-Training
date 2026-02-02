package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Software {

    @BugReport(description = "Null Pointer")
    @BugReport(description = "Memory Leak")
    void process() {}
}

public class BugReportDemo {
    public static void main(String[] args) throws Exception {

        Method m = Software.class.getMethod("process");
        BugReport[] bugs = m.getAnnotationsByType(BugReport.class);

        for (BugReport b : bugs) {
            System.out.println(b.description());
        }
    }
}

