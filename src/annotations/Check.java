package annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@veryImportant // no error as it is a class
public class Check {
    //    @veryImportant // error as it is not a class , it is not applicable to meathods
    @important
    // no error as it is also applicable to meathods
    void show() {
        System.out.println("i am meathod with annotation");
    }

    void print() {
        System.out.println(" i am meathod with no annotation ");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Check c1 = new Check();
        Check2 c2 = new Check2();

        if (c1.getClass().isAnnotationPresent(veryImportant.class)) { // it is used to check that
            //annotation is present or not
            System.out.println("this is very important ");
        } else {
            System.out.println(" this is not important");
        }
        if (c2.getClass().isAnnotationPresent(veryImportant.class)) {
            System.out.println("this is important class");
        } else {
            System.out.println(" this is not important class");
        }
         for(Method method : c1.getClass().getDeclaredMethods()){
             if(method.isAnnotationPresent(important.class)){
                 method.invoke(c1);
             }
         }
    }
}
