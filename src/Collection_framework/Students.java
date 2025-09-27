package Collection_framework;

import java.util.*;

public class Students implements Comparable<Students> {
    int roll_no;
    String name;
    int marks;

    public Students(int roll_no, String name, int marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Students s) {
        return   s.marks - this.marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}



