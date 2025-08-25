public class This_keyword {
    public static void main(String[] args) {
        Teacher a = new Teacher("Dheeraj_khurana" , "FLA" , 01);
        Teacher b = new Teacher("Anil" , "MP" , 02);
        Teacher c = new Teacher("Harkesh" , "COMPUTER_NETWORKS" , 03);
        Teacher d = new Teacher ("Dheeraj_sahni" , "JAVA" , 04);
        Teacher e = new Teacher("Rainu" , "DAA" , 05);
        Teacher f = new Teacher("Dheerdhwaj_barak" , "SE" ,06);
        a.display();
        b.display();
        c.display();
        d.display();
        e.display();
        f.display();
    }
}
//this is a reference to the current object - the instance whose method or constructor is running
// it is mainly used inside the method or constructor .
//teacher subject and id
class Teacher{
    String name;
    String subject;
    int id ;
    Teacher(String name , String subject , int id){
         this.name = name;
        this.subject = subject;
        this.id = id;
    }
    void display(){
        System.out.println(this.name + " " + this.subject + " " + this.id ) ;
    }
}

