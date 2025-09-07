package generics;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // why generics .. in this list we can add int , string , float like this
        list.add(100);
        list.add("paras");
        list.add(12.76);
//        Integer integer  = list.get(0); // it will show error as the list is of type Object class
        // and we are trying to print integer
        Integer a = (Integer)list.get(1); // we have typecasting the object type to string
        // but one problem is there
        String str1 = (String)list.get(2);
        // see it shows no error but at index  there is float and we have type casted it to String
        //error will come at run time
        //it is not type safe and we need to manual cast and no error at compile time
        // so generics are introduced in which we can make similar types array list
        //ArrayList<String> -- only strings can be added in array list
        //list.add(10) can not be added as it is integer


    }
}
