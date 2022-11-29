// 2. Collection without duplicates.
//Problem:
//Write a method that accepts as input a collection of objects V (Generic), which contains duplicate objects, and returns a collection V without duplicates.
// 2. Collection without duplicates.
//Problem:
//Write a method that accepts as input a collection of objects V (Generic), which contains duplicate objects, and returns a collection V without duplicates.
package JavaAdvanced;

import java.util.*;


public class Task2 {
    public static void main(String[] args)
    {
        // ArrayList with duplicate elements
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

        System.out.println(numbersList);

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(numbersList);

        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);

        System.out.println(listWithoutDuplicates);
    }
}




