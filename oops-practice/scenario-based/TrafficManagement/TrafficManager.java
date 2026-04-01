package scenario_based.TrafficManagement;

import java.util.*;

class TrafficManager {
    private Queue<String> waitingQueue;
    private int capacity;
    private Roundabout roundabout;

    public TrafficManager(int capacity) {
        this.capacity = capacity;
        waitingQueue = new LinkedList<>();
        roundabout = new Roundabout();
    }

    public void enqueueVehicle(String number) {
        if (waitingQueue.size() == capacity) {
            System.out.println("Queue Overflow! Vehicle " + number + " cannot enter");
            return;
        }
        waitingQueue.add(number);
        System.out.println(number + " added to waiting queue");
    }

    public void allowEntry() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting");
            return;
        }
        roundabout.addVehicle(waitingQueue.poll());
    }

    public void exitVehicle() {
        roundabout.removeVehicle();
    }

    public void showRoundabout() {
        roundabout.display();
    }
}
