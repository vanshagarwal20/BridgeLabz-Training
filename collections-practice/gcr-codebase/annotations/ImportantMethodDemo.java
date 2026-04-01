package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Service {

    @ImportantMethod
    void task1() {}

    @ImportantMethod(level = "LOW")
    void task2() {}
}

public class ImportantMethodDemo {
    public static void main(String[] args) {

        for (Method m : Service.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                System.out.println(m.getName() + " " +
                        m.getAnnotation(ImportantMethod.class).level());
            }
        }
    }
}

