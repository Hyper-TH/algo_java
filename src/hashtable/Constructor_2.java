/*
    Java Program to demonstrate the Hashtable(int initialCapacity) constructor

    It creates a Hashtable instance with a specified initial capacity
    and load factor of 0.75

    Author: Twila Habab / GFG
    Date: 09/06/22
    Edited: -

    Implemented in IntelliJ
    Pushed with VSC
 */

package hashtable;

import java.io.*;
import java.util.*;

public class Constructor_2
{
    public static void main(String[] args)
    {
        Hashtable<Integer, String> ht1 = new Hashtable<>(4);
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(2);

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        System.out.println("Mappings of h1: " + ht1);
        System.out.println("Mappings of h2: " + ht2);
    } // end main()

} // end Constructor_2 class
