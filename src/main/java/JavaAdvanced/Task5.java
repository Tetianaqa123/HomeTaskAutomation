// 5. Conversion of two collections into Map.
//Problem:
//Write a method that accepts two arrays/lists of elements of type K, V (Generic) with different number of elements and returns a sorted Map<K, V>.
//Option 1. If the array K > V - then write in the value null, if the array K < V - do not process the extra values
//Option 2. If the array K > V - intercept the error and display the message "Value is not enough for map", if the array K < V - intercept the error and display the message "Key is not enough for map"
package JavaAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> myKeys3 = new ArrayList<>();
        myKeys3.add("order1");
        myKeys3.add("order2");
        myKeys3.add("order3");

        List<String> myKeys4 = new ArrayList<>();
        myKeys4.add("order1");
        myKeys4.add("order2");
        myKeys4.add("order3");
        myKeys4.add("order4");

        List<Integer> myValues3 = new ArrayList<>();
        myValues3.add(1);
        myValues3.add(2);
        myValues3.add(3);

        List<Integer> myValues4 = new ArrayList<>();
        myValues4.add(1);
        myValues4.add(2);
        myValues4.add(3);
        myValues4.add(4);

        // keys > values
        Map<String, Integer> map1 = sortedMap(myKeys4, myValues3);
        System.out.println(map1);

        // keys < values
        Map<String, Integer> map2 = sortedMap(myKeys3, myValues4);
        System.out.println(map2);

    }

    public static Map<String, Integer> sortedMap(List<String> myKeys, List<Integer> myValues) {
        Map<String, Integer> map = new HashMap<>();

        if (myKeys.size() >= myValues.size()) {
            for (int i = 0; i < myKeys.size(); i++) {

                String iterationKey = myKeys.get(i);
                Integer iterationValues;

                if (i >= myValues.size()) {
                    System.out.println("Value is not enough for map");
                    iterationValues = null;
                } else iterationValues = myValues.get(i);

                map.put(iterationKey, iterationValues);
            }

        } else System.out.println("Key is not enough for map");

        Map<String, Integer> sorted = new TreeMap<String, Integer>(map);
        return sorted;
    }
}