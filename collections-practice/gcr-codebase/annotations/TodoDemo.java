package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {

    @Todo(task = "Login feature", assignedTo = "Aman")
    void login() {}

    @Todo(task = "Payment gateway", assignedTo = "Vansh", priority = "HIGH")
    void payment() {}
}

public class TodoDemo {
    public static void main(String[] args) {

        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(t.task() + " " + t.assignedTo() + " " + t.priority());
            }
        }
    }
}

