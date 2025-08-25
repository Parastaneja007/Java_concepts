package static1;

public class Creating_objects {
    public static void main(String[] args) {


    Human paras = new Human(19 , "paras" , 5000000 , false);
    System.out.println(paras.population);
    System.out.println(paras.salary);
    Human parv = new Human(16 , "parv" , 6000000 , false);
    System.out.println(parv.population);
//    System.out.println(this.population); // we can not use this inside static
    }
}
