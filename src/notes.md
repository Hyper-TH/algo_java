| HashMap                                | HashTable                                |
|----------------------------------------|------------------------------------------|
| Introduced in 1.2 version (non-legacy) | There since Java was introduced (legacy) |
| Not thread safe and not synchronized   | Thread safe and synchronized             |
| Fast                                   | Slow                                     |
| Works with single thread               | Works with multiple threads              |
| Allows one null key                    | Does not allow null key                  |


### Example for comparison

```java
// Java program to demonstrate
// HashMap and HashTable

import com.sun.security.jgss.InquireSecContextPermission;

import java.util.*;
import java.lang.*;
import java.io.*;

// Name of the class has to be "Main"
// only if the class is public
class IdeOne {
    public static void main(String[] args) {
        //----------hashtable------------------------
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(100, " Ajay");
        ht.put(101, "Vijay");
        ht.put(102, "Ravi");
        ht.put(103, "Rahul");
        System.out.println("-------------Hash table--------------");

        System.out.println("Size of table is: " + ht.size());

        // Advanced for loop
        for (Map.Entry<Integer, String> m : ht.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        } // end for

        if (ht.containsKey(101)) {
            String a = ht.get(101);
            System.out.println("Value for key" + "101 is: " + a);
        } // end if

        //----------------hashmap--------------------------------
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(104, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        System.out.println("-----------Hash map-----------");

        System.out.println("Size of map is: " + hm.size());

        for (Map.Entry<Integer, String> m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        } // end for

        if (ht.containsKey(104)) {
            String a = hm.get(104);
            System.out.println("Value for key" + "104 is: " + a);
        } // end if

    } // end main()

} // end IdeOne class
```

# References
- [GeeksforGeeks](https://www.geeksforgeeks.org/differences-between-hashmap-and-hashtable-in-java/)
- [GeeksforGeeks Hashmap](https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/)
- [GeeksForGeeks Hashtable](https://www.geeksforgeeks.org/hashtable-in-java/)
- [Youtube](https://www.youtube.com/watch?v=z5tZ0Zb5rJQ)