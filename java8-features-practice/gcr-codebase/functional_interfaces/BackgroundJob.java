package functional_interfaces;

public class BackgroundJob {

    public static void main(String[] args) {

//         Runnable task
        Runnable task = () -> {
            System.out.println("Background job started");
            System.out.println("Task is running...");
            System.out.println("Background job finished");
        };

//         Running task in a new thread
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread continues execution");
    }
}

