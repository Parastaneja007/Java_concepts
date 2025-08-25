public class Constructor {
    public static void main(String[] args) {
        Students paras = new Students("paras" , 126 , "ambala");
        System.out.println(paras.name + " " + paras.roll_no + " " + paras.city);
        Students aakash  = new Students();
//        aakash.name = "jatin"; // first abject is checked so the output is
        System.out.println(aakash.name + " " + aakash.roll_no + " " + aakash.city);

    }
}
class Students {
    String name;
    int roll_no;
    String city ;
    //parameter constructor
     Students(String n , int r , String c){
         name = n;
         roll_no = r;
         city = c;
     }
     //no argument constructor
    Students(){
         name = "aakash";
         roll_no = 130;
         city = "panipat";
    }
    // use of this keywork

        }
