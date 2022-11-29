// 3. Replace the keys and values in the Map with places
//Problem:
//Write a method that takes a Map<K, V> and returns a Map where the keys and values are replaced by places. Since the records may not be unique, the value type in Map will no longer be K, but Collection<K>:Map<V, Collection<K>>
package JavaAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        // Create a HashMap and add some values
        Map<String, Integer> map = new HashMap<>();

        map.put("a", 100);
        map.put("b", 300);
        map.put("c", 300);


        Map<Integer, Collection<String>> newMap = swapped(map);
        // print new mapping
        System.out.println("New HashMap: " + newMap);
    }

    public static Map<Integer, Collection<String>> swapped(Map<String, Integer> args) {
        // print old map
        System.out.println("Old HashMap: " + args.toString());

        Map<Integer, Collection<String>> swapped = new HashMap<>();

        for (var entry : args.entrySet()) {
            swapped.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        return swapped;
    }
}


