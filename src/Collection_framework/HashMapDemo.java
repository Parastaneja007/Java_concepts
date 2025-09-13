package Collection_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap();
        map.put(126 , "Paras");// insertion into a map
        map.put(122 , "Jatin");
        map.put(125 , "Tarun");
        map.put(130 , "Aakash");
        System.out.println(map);
        System.out.println(map.get(130)); // get the value at the key
        System.out.println(map.get(127)); // null as key does not exist
        System.out.println(map.containsKey(126)); // tell that it contains the key or not / o(1) complexity
        System.out.println(map.containsValue("Paras")); // checks that if it contains the value or not
        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }
        for (Map.Entry<Integer, String>  Entry : map.entrySet()) {
            System.out.println(Entry.getKey() + " " + Entry.getValue());
        }
    }
}
