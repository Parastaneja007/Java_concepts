package Properties_oops;

public class Hierarchial_inherit {
    public static void main(String[] args) {
         Dog d1 = new Dog();
        d1.eats();
        Cat c1 = new Cat();
        c1.sound();
    }
    public class hello{

    }
}
 class Animal {
    void eats() {
        System.out.println("this animal eats");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("The dog barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("meaw meaw");
    }
    void nature(){
        System.out.println("Can climb a tree very fast");
    }
}
