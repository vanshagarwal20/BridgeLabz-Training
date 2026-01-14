package stack_queue;

import java.util.*;

public class SortStackRecursion {
//     Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        // Base case: stack is empty
        if (stack.isEmpty()) {
            return;
        }

//         Step 1: Pop top element
        int top = stack.pop();

//         Step 2: Sort remaining stack
        sortStack(stack);

//         Step 3: Insert element at correct position
        insertSorted(stack, top);
    }

//     Helper function to insert element in sorted order
    private static void insertSorted(Stack<Integer> stack, int value) {
//         Base case: stack empty OR correct position found
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

//         Remove top and recurse
        int temp = stack.pop();
        insertSorted(stack, value);

//         Put back the removed element
        stack.push(temp);
    }

//     Main method
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}

