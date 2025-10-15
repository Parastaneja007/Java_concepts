package Basics_programs_and_java_concepts;

public class Strings {
    public static void main(String[] args) {
        String a = "paras";
        String b = "paras";
        System.out.println(a==b);
        // true as == check that the referance variable points to same object or not
        String c = new String("paras");
        System.out.println(a==c);
        // false because now a new object has been created
        System.out.println(a.equals(c));
        // true as it checks the content of string
        System.out.println(a.length());
        System.out.println(a.charAt(3));
        System.out.println(a.substring(1,4));
        System.out.println(a.replace("as" , "v"));
        System.out.println(a.contains("paras"));
    }
}
