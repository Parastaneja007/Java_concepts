public class Shadowing{
    static int x = 20;
    public static void main(String[] args) {
        System.out.println(x); // 20
        int x = 10;
        System.out.println(x); // 10
    }
    public static void fun(){
        System.out.println(x);//20 because x = 10 is not in this scope
    }
    }


