package Collection_framework;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(key1 , 1);// key , 1
        map.put(key2 , 2);//key ,  2
         // both will be printed as the hashcode of the object will be created , which will be different
        // for both the keys
        // Identityhashcode and == , not equals()
        System.out.println(System.identityHashCode(key1)); // in identity hash map
        System.out.println(System.identityHashCode(key2));// in identity hash map
        System.out.println(key1.hashCode());// in hash map
        System.out.println(key2.hashCode());// in hash map
        System.out.println(map);

    }
}
