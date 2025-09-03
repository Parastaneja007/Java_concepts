package object_class;

public class Object_class {
    int num;
    float num2;

    public Object_class(int num , float num2) {
        this.num = num;
        this.num2 = num2;
    }

    public Object_class() {
        super();
    }


    @Override
    public int hashCode() {
        return super.hashCode();
        // it basically gives the number representation of an object
        // it is not the address , it is s random generated number
        // to cheack wheather the object is same or not
//        Returns an integer hash code for the object.
//
//        Used in hashing-based collections (HashMap, HashSet).
//
//                If you override equals(), you should also override hashCode().
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((Object_class)obj).num;
//        Compares two objects for equality.
//
//                Default: compares references (like ==).
//
//                Usually overridden to compare contents.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
//        Creates and returns a copy of the object.
//
//        For this, the class must implement Cloneable interface.
    }

    @Override
    public String toString() {
        return super.toString();
//        Returns a string representation of the object.
//
//                Default: "ClassName@hashcode".
//
//                Usually overridden to give meaningful output.
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
//        Called by Garbage Collector before destroying an object.
//
//        Rarely used, not recommended in modern Java.
    }

    public static void main(String[] args) {
        Object_class obj1 = new Object_class(12 , 15.4f);
        System.out.println(obj1.hashCode());
        Object_class obj2 = new Object_class(12 , 19.4f);
        if(obj1 == obj2){
            System.out.println("object is equal");
        }
        if(obj1.equals(obj2)){
            System.out.println("objects are equal");
        }
        System.out.println(obj1.toString());
        System.out.println(obj1 instanceof Object_class);
//        What is instanceof?
//
//        It’s a binary operator in Java.
//
//        Used to test whether an object is an instance of a specific class (or subclass, or interface).
//
//        Returns a boolean (true or false).
        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());
//        What is getClass()?
//
//                A final (we can not override this as it is final)method of the Object class (so every object has it).
//
//        Returns a Class<?> object that represents the runtime class of the object.
    }
}
//    If you override equals(), always override hashCode().
//
//        Otherwise, collections that rely on hashing (HashMap, HashSet) will misbehave.
//
//        This is a must-know rule for interviews.
//Rule in Java
//
//        If two objects are equal according to equals(), they **must have the same hashCode()`.
//
//        Otherwise, collections like HashMap, HashSet, won’t work properly.
