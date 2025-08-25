package static1;

public class Initialization {
   static int a = 12;
   static int b;
    static{
        b = a*5 ;// inside a static block
        System.out.println("initializing b "  + b);
    }

    public static void main(String[] args) {
        Initialization obj1 = new Initialization(); // static blocks runs once when the class is being loaded
        System.out.println(a +  " " + b );
        b += 3;
        System.out.println(a +  " " + b);
        System.out.println(a +  " " + b);
        System.out.println(a +  " " + b);



    }
}
