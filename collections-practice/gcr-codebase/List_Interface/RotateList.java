package List_Interface;

import java.util.*;

public class RotateList {

    public static List<Integer> rotateList(List<Integer> list, int k) {
        int n = list.size();
//      handle k > size
        k = k % n;   

        List<Integer> rotated = new ArrayList<>();

//         add elements from k to end
        for (int i = k; i < n; i++) {
            rotated.add(list.get(i));
        }

//         add first k elements
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        return rotated;
    }

    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        System.out.println(rotateList(list, 2));
    }
}


