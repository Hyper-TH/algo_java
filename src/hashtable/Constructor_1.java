/*
    Java Program to demonstrate the Hashtable() constructor

    It is the default constructor which creates an instance of
    HashMap with an initial capacity of 11 and load factor of 0.75

    Author: Twila Habab / GFG
    Date: 09/06/22
    Edited: -

    Implemented in IntelliJ
    Pushed with VSC
 */
package hashtable;

// Import classes
import java.io.*;
import java.util.*;

public class Constructor_1
{
    public static void main(String[] args)
    {
        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

        // Adding elements using put method
        // Custom input elements
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");


        // Print mappings to the console
        System.out.println("Mappings of ht1: " + ht1);
        System.out.println("Mappings of ht2:" + ht2);

    } // end main()

} // end Constructor_1 class
