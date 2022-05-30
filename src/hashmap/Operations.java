/*
    Java Program to demonstrate operations for the HashMap

    - Adding
    - Changing
    - Deleting
    - Traversing

    Author: Twila Habab / GFG
    Date: 30/05/22
    Edited: -

    Implemented in IntelliJ
    Pushed with VSC
 */
package hashmap;

import java.io.*;
import java.util.*;

public class Operations
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> hm1 = new HashMap<>();
        HashMap<Integer, String> hm2 = new HashMap<>();


        // Adding Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        hm2.put(1, "Geeks");
        hm2.put(2, "For");
        hm2.put(3, "Geeks");

        System.out.println("Mappings of HashMap hm1 are : " + hm1);
        System.out.println("Mapping of HashMap hm2 are : " + hm2);


        // Changing elements
        hm1.put(1, "Geeks");
        hm1.put(2, "Geeks");
        hm1.put(3, "Geeks");

        System.out.println("Initial Map " + hm1);

        hm1.put(2, "For");

        System.out.println("Updated Map " + hm1);


        // Removing elements with a key
        String removedMap = hm2.remove(2);

        System.out.println("Removed map: " + removedMap);
        System.out.println("Mapping for hm2 after removal: " + hm2);


        // Traversing the map
        for (Map.Entry<Integer, String> e : hm1.entrySet())
        {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        } // end for

    } // end main()

} // end Operations class
