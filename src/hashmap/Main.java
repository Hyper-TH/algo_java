/*
    https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/

    - HashMap<K, V> is a part of Java’s collection since Java 1.2.
    - This class is found in java.util package.
    - It provides the basic implementation of the Map interface of Java.
    - It stores the data in (Key, Value) pairs, and you can access them
      by an index of another type (e.g. an Integer).
    - One object is used as a key (index) to another object (value).
    - If you try to insert the duplicate key, it will replace the element
       of the corresponding key.
    - Only ONE null key object and there can be any number of null values.

    Author: Twila Habab / GFG
    Date: 30/05/22
    Edited: -

    Implemented in IntelliJ
    Pushed with VSC
*/

package hashmap;

// Import HashMap class
import java.util.HashMap;

public class Main
{
    // Driver method
    public static void main(String[] args)
    {
        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the Map
        // using standard put() method
        map.put("Twila", 10);
        map.put("Jay", 30);
        map.put("Alex", 20);

        // Print size and content of the Map
        System.out.println("Size of map is: " + map.size());

        // Printing elements in object of Map
        System.out.println(map);

        // Checking if a key is  present and if
        // present, print value by passing
        // random element
        if (map.containsKey("Twila"))
        {
            // Mapping
            Integer a = map.get("Twila");

            // Printing value for the corresponding key
            System.out.println("Value for key: " + "\"Twila\" is: " + a);

        } // end if

    } // end main()

} // end Main class
