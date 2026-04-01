package multi_threading_practice;

import java.time.LocalTime;
import java.util.*;

public class ThreadStateMonitoringSystem {

    // TaskRunner thread
    static class TaskRunner extends Thread {

        public TaskRunner(String name) {
            super(name);
        }

        @Override
        public void run() {
            // RUNNABLE (computation)
            for (int i = 0; i < 1_000_000; i++) {
                int x = i * i;
            }

            // TIMED_WAITING
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // RUNNABLE again
            for (int i = 0; i < 1_000_000; i++) {
                int y = i + i;
            }
        }
    }

    // StateMonitor thread
    static class StateMonitor extends Thread {
        private Thread[] threads;
        private Map<String, Set<Thread.State>> stateMap = new HashMap<>();

        public StateMonitor(Thread[] threads) {
            this.threads = threads;
        }

        @Override
        public void run() {
            boolean allTerminated = false;

            while (!allTerminated) {
                allTerminated = true;

                for (Thread t : threads) {
                    Thread.State state = t.getState();
                    String time = LocalTime.now().withNano(0).toString();

                    stateMap.putIfAbsent(t.getName(), new HashSet<>());
                    stateMap.get(t.getName()).add(state);

                    System.out.println("[Monitor] " + t.getName() +
                            " is in " + state + " state at " + time);

                    if (state != Thread.State.TERMINATED) {
                        allTerminated = false;
                    }
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Summary
            System.out.println("\nSummary:");
            for (String name : stateMap.keySet()) {
                System.out.println(name + " went through "
                        + stateMap.get(name).size() + " states");
            }
        }
    }

    public static void main(String[] args) {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        Thread[] tasks = {task1, task2};

        StateMonitor monitor = new StateMonitor(tasks);

        // NEW state observed here
        monitor.start();

        task1.start();
        task2.start();
    }
}

