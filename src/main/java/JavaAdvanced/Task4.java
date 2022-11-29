// 4. Placing orders.
//    Problem:
//    Create a String array with orders (with duplicate orders) that came to the online store. Create two types of collections, HashSet and TreeSet, to which we need to add our orders. Display a list of HashSet and TreeSet separately from each other. *Make at least 5 orders.

        package JavaAdvanced;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Task4 {
    public static void main(String args[]) {
        //creating a HashSet
        HashSet<String> onlineStore1 = new HashSet<String>();
        //creating a TreeSet
        TreeSet<String> onlineStore2 = new TreeSet<String>();

        for(String online: Arrays.asList("order1", "order2", "order2", "order3", "order4", "order5" )) {
            onlineStore1.add(online);
            onlineStore2.add(online);
        }

        System.out.println("Ordering in HashSet :" + onlineStore1);
        System.out.println("Ordering in TreeSet :" + onlineStore2);


    }
}
