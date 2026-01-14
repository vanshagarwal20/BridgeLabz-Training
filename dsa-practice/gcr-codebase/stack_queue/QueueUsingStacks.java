package stack_queue;

import java.util.*;

class QueueUsingStacks {
    private Stack<Integer> stackEnq = new Stack<>();
    private Stack<Integer> stackDeq = new Stack<>();

//     Enqueue operation
    public void enqueue(int x) {
        stackEnq.push(x);
    }

//     Dequeue operation
    public int dequeue() {
//    	if both the stacks are empty
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
//        if the dequeue stack is empty than we will transfer
        if (stackDeq.isEmpty()) {
//        	until first stack is not going to be empty
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }
        return stackDeq.pop();
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }

        return stackDeq.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stackEnq.isEmpty() && stackDeq.isEmpty();
    }
    
    
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.peek());    // 20
        System.out.println(queue.dequeue()); // 20
        System.out.println(queue.dequeue()); // 30
    }
}




