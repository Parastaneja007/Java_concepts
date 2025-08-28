package Properties_oops;

public class Box_weight extends Box{
    double w;

    public Box_weight(double l, double b, double h, double w) {
        super(l, b, h); // what is this? - call the parent class constructor
        // check it by clicking ctrl on super , it will go to the parent class
        // used to initialize the value present in the parent class


        this.w = w; // this is extra so we have to use it
    }

    public Box_weight(){
        this.w = -1;

    }

}
