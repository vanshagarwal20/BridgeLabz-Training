package stack_queue;

import java.util.*;

public class CustomHashMap<K, V> {
    // Make Node static
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 16;
    private Node<K, V>[] buckets;

//     Constructor
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = (Node<K, V>[]) new Node[capacity];
    }

//     Hash function
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

//     PUT
    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> head = buckets[index];

        Node<K, V> curr = head;
        while (curr != null) {
            if (curr.key.equals(key)) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

//     GET
    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> curr = buckets[index];

        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }

//     REMOVE
    public void remove(K key) {
        int index = getIndex(key);
        Node<K, V> curr = buckets[index];
        Node<K, V> prev = null;

        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

//     MAIN
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("India", 140);
        map.put("USA", 33);
        map.put("UK", 6);

        System.out.println(map.get("India")); // 140
        System.out.println(map.get("USA"));   // 33

        map.remove("USA");
        System.out.println(map.get("USA"));   // null
    }
}


