package list_interface;

import java.util.*;

public class ReverseList {

//     Reverse ArrayList (Index-based swapping)
    public static List<Integer> reverseArrayList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        return list;
    }

//      Reverse LinkedList
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();

        for (Integer val : list) {
            reversed.addFirst(val);
        }
        return reversed;
    }

    public static void main(String[] args) {

//         ArrayList example
        ArrayList<Integer> arrList =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Reversed ArrayList: " +
                reverseArrayList(arrList));

//         LinkedList example
        LinkedList<Integer> linkList =
                new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Reversed LinkedList: " +
                reverseLinkedList(linkList));
    }
}



