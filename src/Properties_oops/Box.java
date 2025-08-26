package Properties_oops;

public class Box {
    double l ;
    double b;
    double h;
    Box(){
        this.h = -1;
        this.l = -1;
        this.b = -1;
    }
    // cube
    Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }
    Box(double l , double b , double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.b = old.b;
    }
    public void information(){
        System.out.println("running the box");
    }
}
