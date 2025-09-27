package Collection_framework;
import java.util.HashMap;
import java.util.Map;
public class IdentityHashMap {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        Map<String, Integer> map = new HashMap<>();
        map.put(key1 , 1);// key , 1
        map.put(key2 , 2);//key ,  2
        //equals method-- it will same only one value which is key = 2 , as it will replace it from
        //existing one but if we use identity hash map then no replace ment will be there
        System.out.println(map);
      }
    }
