package interfaces_05;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.acc();
        c1.start();
        c1.stop();
        Engine.speed(); // calling the static meathod by interface name

    }
}
