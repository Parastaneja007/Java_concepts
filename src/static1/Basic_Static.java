package static1;

public class Basic_Static {
    public static void main(String[] args) {
//            student();
//            a(); but here we can not run both as both are non static
        //we can not use a non static meathod inside a static meathod
        //to use student we need to make student static
        greeting(); // we can use this as greeting is static
        Basic_Static s = new Basic_Static();
        s.student();// now we can use it as we have created the object of non static member
    }
        void student () {
            System.out.println("I am a student");
        }
        static void greeting () {
            System.out.println("hello , i am paras");
        }
        void a(){
        student();// here we can use static like this as a is also non static and a will manage for
            // student
        }

    }


