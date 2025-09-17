package Collection_framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<k,v> extends LinkedHashMap<k,v> {
    private int  capacity ;

    public LRUCache(int initialCapacity , float loadFactor, int capacity) {
        super(initialCapacity , loadFactor );
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
         return size() > capacity ; // to remove the eldest value 
    }

    public static void main(String[] args) {
        LRUCache<String , Integer> student = new LRUCache<>(10 , 0.3f , 3);
        student.put("paras" , 126);
        student.put("jatin" , 122);
        student.put("lavish",137);
        student.put("aakash" , 130);
        for (Map.Entry<String , Integer>  Entry : student.entrySet()) {
            System.out.println(Entry.getKey() + " " + Entry.getValue()); // not in order
        } // eldest value is removed
    }
}


