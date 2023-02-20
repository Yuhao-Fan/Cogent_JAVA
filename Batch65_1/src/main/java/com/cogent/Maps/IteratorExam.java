package com.cogent.Maps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorExam {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Add some key-value pairs to the HashMap
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        // Iterate through the HashMap using an Iterator
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
