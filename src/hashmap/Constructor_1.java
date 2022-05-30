/*
    Java Program to demonstrate the HashMap() constructor

    It is the default constructor which creates an instance of
    HashMap with an initial capacity of 16 and load factor of 0.75

    Author: Twila Habab / GFG
    Date: 30/05/22
    Edited: -

    Implemented in IntelliJ
    Pushed with VSC
 */
package hashmap;

// Import classes
import java.io.*;
import java.util.*;

public class Constructor_1
{
    // Driver method
    public static void main(String[] args)
    {
        // No need to mention the
        // Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>();

        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        // Adding elements using put method
        // Custom input elements
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        // Print and display mapping of HashMap 1
        System.out.println("Mappings of HashMap hm1 are: " + hm1);

        // Print and display mapping of HashMap 2
        System.out.println("Mappings of HashMap hm2 are: " + hm2);

    } // end main()
} // end Constructor_1 class
