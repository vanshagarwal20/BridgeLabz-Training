package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Work {

    @LogExecutionTime
    void doWork() throws InterruptedException {
        Thread.sleep(300);
    }
}

public class ExecutionTimeDemo {
    public static void main(String[] args) throws Exception {

        Work w = new Work();
        Method m = Work.class.getMethod("doWork");

        long start = System.nanoTime();
        m.invoke(w);
        long end = System.nanoTime();

        System.out.println("Time: " + (end - start));
    }
}

