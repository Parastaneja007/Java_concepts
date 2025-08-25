package static1;
 class Inner_class {
    static String name; // by putting ststic we will use Inner_class.name
     // and in both output will be same parv as it chaages same fo all objects
     // without static we need to put this keyword anad it will run different for different objects
     // but we then have to use this.name

    // constructor
    public  Inner_class(String name) {
        Inner_class.name = name;
    }
}

public class Class_inner_class {
//    class Inner_class {
//        String name;
//
//        // constructor
//        public  Inner_class(String name) {
//            this.name = name;
//        }
//    }
    public static void main(String[] args) {
        // create objects of Test directly
        Inner_class a = new  Inner_class("paras");
        Inner_class b = new  Inner_class("parv");
        // it will show error because the inner_class depend on its outside class but
        // if we use inner class at top then no error will be shoun
        // another way to solve this is to make
        // but now the output will b paras parv instead of parv parv but why
        // it is static it should not depend on object , because it is used in inner class
        // so it does not depend on the main outer class objrct not inner one.

        System.out.println("Object a name = " + a.name);
        System.out.println("Object b name = " + b.name);
    }
}








