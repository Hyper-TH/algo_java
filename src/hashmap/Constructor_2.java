/*
    Java Program to demonstrate the HashMap(int initialCapacity) constructor

    It creates a HashMap instance with a specified initial capacity and load factor of 0.75

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

public class Constructor_2
{
    // Driver method
    public static void main(String[] args)
    {
        HashMap<Integer, String> hm1 = new HashMap<>(10);
        HashMap<Integer, String> hm2 = new HashMap<>(2);

        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        System.out.println("Mappings of HashMap hm1 are: " + hm1);
        System.out.println("Mappings of HashMap hm2 are: " + hm2);

    } // end main()
} // end Constructor_2
