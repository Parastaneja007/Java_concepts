package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Paras";
        student.roll_no = 126;
        student.age = 126;
        System.out.println(student.age);
        // in upper we can easily get and set the values
        // but encapsulation means we can not get or set the values directly but we can do it
        //by meathods getter and setter
        // in student2 and Test2 i will explain all this
    }
}
