package map_interface;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> freqMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Remove punctuation & convert to lowercase
                line = line.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();

                // Split by whitespace
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.isEmpty()) continue;
                    freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return freqMap;
    }

    public static void main(String[] args) {
        // Replace with your file path
        String filePath = "sample.txt";

        Map<String, Integer> wordFreq = countWordFrequency(filePath);
        System.out.println(wordFreq);
    }
}

