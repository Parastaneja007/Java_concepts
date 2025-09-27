package Collection_framework;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo{
    public static void main(String[] args) {
        SortedMap<Integer , String >  map = new TreeMap<>((a , b) -> b - a);//inside brackets comparator
        //for descending pass comparator inside brackets , by deafault ascending
        map.put(126 , "paras" );
        map.put(122 , "jatin");
        map.put(130 , "aakash");
        map.put(137 , "lavish");
        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(126));
        System.out.println(map.tailMap(130));
    }
}
