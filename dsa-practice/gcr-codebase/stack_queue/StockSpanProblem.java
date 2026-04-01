package stack_queue;

import java.util.*;

public class StockSpanProblem {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {

//             Pop while current price >= price at stack top index
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

//             If stack empty → no greater element on left
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

//             Push current index
            stack.push(i);
        }

        return span;
    }

    // Main method
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = calculateSpan(prices);

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

