package Properties_oops;

public class Run_box {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(12);
        Box box3 = new Box(10 , 15 , 20);
        Box box4 = new Box(box2);
        Box_weight box5 = new Box_weight();

        // box 5 will inherrit all the propeties of box class and also hae weight as a
        // adiitional property
        System.out.println(box5.h + " " + box5.w);

        System.out.println(box1.l + " " + box1.b + " " + box1.h);
    }
}
