package Properties_oops;

public class Run_box {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box2 = new Box(12);
//        Box box3 = new Box(10 , 15 , 20);
//        Box box4 = new Box(box2);
//        Box_weight box5 = new Box_weight();
         Box box5 = new Box_weight(12 , 13 , 14 , 18);
//        System.out.println(box5.w);
         // in this box 5 example we have taken object type as box weight but it is refering to
        // box(parent)
        // we are not able to access weight because it is the type of reference variable(here box)
        // not object(here box_weight) which determines that which variable we can access
//        Box_weight box6 = new Box(12 , 13 , 56 , 12);
        // error in above as we can reference a child to parent
        // some points to clear things
        //1st we can access variables and mreathods of type reference variable
        // 2nd so here in this error the reference variable is of type box_weight
        // and box_weight only has weight variable but we are calling the constructor of
        // parent class which has no idea about weight
        //upper classes have no idea about the below classes but below classes have the idea
        // of upper classes



//        System.out.println(box5.h + " " + box5.w);
        // box 5 will inherrit all the propeties of box class and also hae weight as a
        // adiitional property
//
//        System.out.println(box1.l + " " + box1.b + " " + box1.h);
    }
}
