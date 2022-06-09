/*
    Java Program to demonstrate the Hashtable(Map<? extends K?, extends V> m) constructor

    It creates a Hashtable that is initialized with the elements in m

    Author: Twila Habab / GFG
    Date: 09/06/22
    Edited: -

    Implemented in IntelliJ
    Pushed with VSC
 */
package hashtable;

import java.io.*;
import java.util.*;

public class Constructor_4
{
    public static void main(String[] args)
    {
        Map<Integer, String> hm = new HashMap<>();

        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");

        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(hm);

        System.out.println("Mappings of ht2: " + ht2);
    } // end main()

} // end Constructor_4 class
