package Collection_framework;

import java.util.HashMap;
import java.util.Objects;

public class HashcodeAndEquals {
    public static void main(String[] args) {
        Person p1 = new Person("paras", 1);
        Person p2 = new Person("parv", 2);
        Person p3 = new Person("paras", 1);
        HashMap<Person , String> map = new HashMap<>();
        map.put(p1 , "first");
        map.put(p2 , "second");
        map.put(p3 , "third");
        System.out.println(map.size());
    }

}
class Person{
    private String name;
    private int id ;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name , id );
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true ; //If both references point to the same object in memory, they are obviously equal.
           // No further checks are needed.
        }
        if(obj == null){
            return false;//If you compare to null, they cannot be equal.
        }
        if(getClass() != obj.getClass()){
            return false ;
            //Ensures that both objects are of the exact same class (Person).
            //This avoids comparing a Person with some subclass or unrelated class.
            // watch again later , not clear .
        }
        Person other = (Person) obj ;
        return id == other.getId() && Objects.equals(name , other.getName());
    }

    @Override
    public String toString() {
        return  "id " + id + ", name " + name ;
    }
}
