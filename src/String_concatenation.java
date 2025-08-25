import java.util.ArrayList;

public class String_concatenation {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
//        System.out.println(new Integer(20) + new ArrayList<>());
        // error - can not be added
        // we can add only primitives or there must be one string for adding so that others can be converted to string
        System.out.println(new Integer(20) + "" + new ArrayList<>()  );
    }
}
