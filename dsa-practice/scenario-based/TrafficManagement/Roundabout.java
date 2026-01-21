package scenario_based.TrafficManagement;

class Roundabout {
    private Vehicle tail;

    public void addVehicle(String number) {
        Vehicle v = new Vehicle(number);

        if (tail == null) {
            tail = v;
            tail.next = tail;
        } else {
            v.next = tail.next;
            tail.next = v;
            tail = v;
        }
        System.out.println(number + " entered roundabout");
    }

    public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle head = tail.next;

        if (head == tail) {
            System.out.println(head.number + " exited roundabout");
            tail = null;
        } else {
            System.out.println(head.number + " exited roundabout");
            tail.next = head.next;
        }
    }

    public void display() {
        if (tail == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Vehicle temp = tail.next;
        System.out.print("Roundabout Vehicles: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println("(back to start)");
    }
}
