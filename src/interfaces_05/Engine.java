package interfaces_05;

public interface Engine {
    static void speed() {
        System.out.println("Static meathod inside interface must have body");
        //call via the interface name
    }
    void start();
    void stop();
    void acc();
    int price = 100000; // it is by deafault static and final
}
