package package1;

public class Demo {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        // Make objects eligible for GC
        obj1 = null;
        obj2 = null;

        // Suggest GC
        System.gc();
        System.runFinalization(); // Force finalize() execution

        // Give JVM time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Basics_programs_and_java_concepts.Main method finished");
    }

    @Override
    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {
        System.out.println("finalize() called, object destroyed!");
        super.finalize();
    }
}
