/*
    Java Program to demonstrate the HashMap(Map map) constructor

    Creates an instance of HashMap with the same mappings as the specified map

    Author: Twila Habab / GFG
    Date: 30/05/22
    Edited: -

    Implemented in IntelliJ
    Pushed with VSC
 */
package hashmap;

import java.io.*;
import java.util.*;

public class Constructor_4
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> hm1 = new HashMap<>();

        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        HashMap<Integer, String> hm2 = new HashMap<>(hm1);

        System.out.println("Mappings of HashMap hm1 are : " + hm1);

        System.out.println("Mapping of HashMap hm2 are : " + hm2);

    } // end main()

} // end Constructor_4 class
