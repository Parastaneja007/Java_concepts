package Encapsulation;

public class Student2 {
    private String name;
    private int roll_no;
    private int age ;
    // we have set all this private so that we can not set their values or get it in Test2 class
    // but we will create getter and setter meathod inside this to access it in Test2 class
    public void setAge(int x){ // take different variable name like here i have taken x
        if(x<0){
            x = 0;
        }
        age = x; // if i have to write age instead of x in parameter then i have to use this.age here
        // to avoid confusion
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        if (roll_no>200){
            System.out.println("invalid roll no");
        } else {
            this.roll_no = roll_no;
        }
    }
}
