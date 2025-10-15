package Basics_programs_and_java_concepts;

public class Scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println(a);
    }
    public static void random(){
        int a = 10;
//        System.out.println(a); we cannot access a as it is of another meathod , we have to make a different a for this meathod
        // it is called meathod scope or parameter scope as the parameter are only accessed in that meathod only
        {
            // it is block scope. its few points are
            //1st we can not again initialize a variable again that is initialized in the meathod.
//            int a = 20;
            //2nd but we can modify the variable that is initialized outside but in the meathod.
            a = 20;
            //3rd the variable initialized here can not be used outsite but outside we can make initialize the sae variable
            int c = 30;

        }
//        c = 40; not possible as it is initialized in the block
        int c = 50; // we can initialize c again
    }

    }
    // use word declare instead of initialization
//  declaration  is int x
//  initialization is x = 20;
// so declaration will come


