package interfaces_05;

public class Car implements Engine , Brake , Media {
    // as they are abstract by deafault so we have to override
    // we cannot do multiple inheritance in java so we can not extends more than one class so
    //interfaces are used
    @Override
    public void brake() {
        System.out.println("i brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");

    }

    @Override
    public void acc() {
        System.out.println(" i accelerate like a normal car");
    }
}
