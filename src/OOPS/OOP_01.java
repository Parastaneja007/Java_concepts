package OOPS;

public class OOP_01 {
    public static void main(String[] args) {
//        OOPS.Student[] students = new OOPS.Student[5];
        Student paras = new Student();
//        paras.roll_no = 126;
        paras.name = "paras" ;
        paras.marks = 81.5f;
        System.out.println(paras.roll_no);
        System.out.println(paras.name);
        System.out.println(paras.marks);
        //first it will check value of object then it will go to class values or default value
        Student parv = new Student();
        System.out.println(parv.roll_no);
        // if student has many properties like 100 properties , so we can not do it like again and again
        //writing paras.rollno etc so in this case we use constructor
        Student random = new Student();
        System.out.println(random.name);


    }

    }
class Student {
    int roll_no = 100;// if object does not has any value then this value will get printed
    String name;
    float marks;
    Student(int roll_no , String name , float marks){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
    Student(){
        // we are calling a constructor from a constructor
        //internally new OOPS.Student(101 , "random" , 67.6f)
         this(101 , "random" , 67.6f);
    }

}
//constructors in different file

