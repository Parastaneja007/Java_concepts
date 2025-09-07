package generics;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setValue(1);
//        String i = (String)box.getValue(); // no error at compile time without generics but we are
        //writing string instead of int which will show an exception at run time , to aboid this
        // we use generics .
//        System.out.println(i);
        Box_generic<Integer> box1 = new Box_generic<>();
        box1.setValue(1);
//        Box_generic<String> box2 = new Box_generic<String>(); // we cannot use string as Box_generic
        // is bounded to Numbers which do not include string , by using extends we can bound generics
//        String s = (String)box1.getValue();
        // now error will come when we try to put string so box is now type safe
        int a  = (int)box.getValue();
        System.out.println(a);
        Pair<String , Integer> p1 = new Pair<>("paras" , 20);
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
    }
}
