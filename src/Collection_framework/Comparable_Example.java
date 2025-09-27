package Collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Example {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students(1, "paras", 90));
        list.add(new Students(2, "mukul", 85));
        list.add(new Students(3, "advik", 95));
        Collections.sort(list);
        System.out.println(list);
    }
}
