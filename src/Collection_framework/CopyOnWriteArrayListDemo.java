package Collection_framework;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> copylist = new CopyOnWriteArrayList<>();
        // copy on write means whenever a write operation occurs
        //like adding or removing the element
        //instead of directly modifying te existing list
        // a new copy of the list is created , and the modification on done on that
        // this ensures that the thread reading the list its being modidfies remains unaffected
        // read operation - fast and direct , since they happen on a stable list without
        // interferance from modification
        // write operation - a new copy of the list is created for every modification
        // the reference to the list is then updated so the subsequents reads use this new list
        // use when read intensive thing is more because on every modification a copy is made so more memory
        // watch codes late , only basic theory - comeback after multithrading and write 2-3 codes
    }
}
