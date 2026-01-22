package Map_Interface;

import java.util.*;

public class InvertMap {

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> original) {
        Map<V, List<K>> inverted = new HashMap<>();

        for (Map.Entry<K, V> entry : original.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

//             If value already exists, add key to list, else create new list
            inverted.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return inverted;
    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> invertedMap = invertMap(map);
        System.out.println(invertedMap);
    }
}

