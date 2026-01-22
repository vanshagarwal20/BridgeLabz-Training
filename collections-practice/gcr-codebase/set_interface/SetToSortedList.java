package set_interface;

import java.util.*;

public class SetToSortedList {

    public static List<Integer> convertAndSort(Set<Integer> set) {
//         Convert to list
        List<Integer> sortedList = new ArrayList<>(set);
//         Sort in ascending order
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println(convertAndSort(set));
    }
}

