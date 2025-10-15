package Basics_programs_and_java_concepts;

public class GC_and_finalize {
    public static void main(String[] args) {
        for (int i = 0; i < 1090909822; i++) {
            String a = new String("paras");
        }
        System.gc();
    }

    @Override
    protected void finalize()  throws Throwable{
        System.out.println("object is destroyed");
    }
}
