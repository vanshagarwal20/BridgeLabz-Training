package annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = "HIGH", assignedTo = "Vansh")
    void completeProject() {}
}

public class TaskInfoDemo {
    public static void main(String[] args) throws Exception {

        Method m = TaskManager.class.getMethod("completeProject");
        TaskInfo info = m.getAnnotation(TaskInfo.class);

        System.out.println(info.priority());
        System.out.println(info.assignedTo());
    }
}
