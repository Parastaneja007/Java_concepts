package static1;

public class Human {
    int age;
    String name;
    int salary;
    boolean marriage;
    static int population ; //static - such properties are not related to particular objects but are
    //common to all objects we declare those as static
   public Human(int age , String name , int salary , boolean marriage){
       this.age = age ;
       this.name = name;
       this.salary = salary;
       this.marriage = marriage;
       Human.population += 1;// use class name with static instead of this keyword
   }
}