package Queue_Interface;


public class CircularBuffer {
    private int[] buffer;
    private int capacity;
    private int size = 0;
    private int head = 0; // points to oldest element
    private int tail = 0; // points to next insertion position

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }

    // Insert element
    public void insert(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;

        if (size < capacity) {
            size++;
        } else {
            // buffer full, overwrite oldest element
            head = (head + 1) % capacity;
        }
    }

    // Get buffer contents in order from oldest to newest
    public void display() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            int index = (head + i) % capacity;
            System.out.print(buffer[index]);
            if (i != size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display(); // [1, 2, 3]

        cb.insert(4);
        cb.display(); // [2, 3, 4]

        cb.insert(5);
        cb.insert(6);
        cb.display(); // [4, 5, 6]
    }
}

