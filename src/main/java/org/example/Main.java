package org.example;

// Task 1 - Write a Java program to print the sum of two numbers.
// Test Data:
//        74 + 36
// Expected Output :
//        110

// public class Main {
//    public static void main(String[] args) {
//        System.out.println(74+36);
//    }
// }

// Task 2 	Write a Java program to print the result of the following operations.
//Test Data:
//        a. -5 + 8 * 6
//        b. (55+9) % 9
//        c. 20 + -3*5 / 8
 //       d. 5 + 15 / 3 * 2 - 8 % 3

// public class Main {
//    public static void main(String[] args) {
//        System.out.println(-5 + 8 * 6);
//        System.out.println((55+9) % 9);
//       System.out.println(20 + -3*5 / 8);
//        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
// }
// }

// Task 3.	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. (Create a separate method for each operation)
// Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//       125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5

/* package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * / %): ");

        double result = 0;

        switch (op) {
            case "+":
                result = addValues(s1, s2);
                break;
            case "-":
                result = subtractValues(s1, s2);
                break;
            case "*":
                result = multiplyValues(s1, s2);
                break;
            case "/":
                result = divideValues(s1, s2);
                break;
            case "%":
                result = modValues(s1, s2);
                break;
            default:
                System.out.println("Unrecognized operation!");
                return;
        }

        System.out.println("The answer is " + result);
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    private static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    private static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    private static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }
    private static double modValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 % d2;
    }
}
*/

// Task 4 	Write a Java program to sum values of an array.
// Test Data:
//       [5,6,7,12,-5,32,43]
//        Expected Output : 100

// public class Main {
//    public static void main(String[] args) {
//        int array[] = {5,6,7,12,-5,32,43};
//        int sum = 0;
//        for (int i : array)
//            sum += i;
//        System.out.println("The sum is " + sum);
//   }
// }


//Task 5 - 5.	Write a Java program to find the duplicate values of an array of integer values.
//Test Data:
//[5,6,7,12,-5,32,43,6,12]
//Expected Output : 6,12

// import java.util.Arrays;
// public class Main {
//    public static void main(String[] args) {

//        int[] my_array = {5,6,7,12,-5,32,43,6,12};

//       for (int i = 0; i < my_array.length-1; i++)
//       {
//            for (int j = i+1; j < my_array.length; j++)
//          {
//             if ((my_array[i] == my_array[j]) && (i != j))
//            {
//               System.out.println("Duplicate Element : "+my_array[j]);
//           }
//       }
//    }
//  }
// }

// JAVA BASIC. PART2
/* 1.	Write a Java program to concatenate a given string to the end of another string. And remove all `P` or `p` characters.
        Test Data:
        String 1: PHP Exercises and
        String 2: Python Exercises
        Expected output:
        The concatenated string with replacements: H Exercises and ython Exercises */


/* public class Main {
    public static void main(String[] args)
    {
        String str1 = "PHP Exercises and";
        String str2 = "Python Exercises";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);


        // Concatenate the two strings together.
        String str3 = str1.concat(str2);

        // Display the new String.
        System.out.println("The concatenated string: "+str3.replace("P",  ""));

    }

} */

/* 5.	The following code creates one array and one string object. How many references to those objects exist after the code executes?
        ...
        String[] students = new String[10];
        String studentName = "Peter Parker";
        students[0] = studentName;
        studentName = null;
        ...

  Answer: There is one reference to the students array and that array has one reference to the string Peter Smith. Neither object is eligible for garbage collection. The array students is not eligible for garbage collection because it has one reference to the object studentName even though that object has been assigned the value null. The object studentName is not eligible either because students[0] still refers to it

 6.	How does a program destroy an object that it creates?
 Answer: A program does not destroy objects. A program can set all references to an object to null so that it becomes eligible for garbage collection. But the program does not actually destroy objects.
*/





