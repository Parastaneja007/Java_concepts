package Properties_oops;

public class Car_run {
    public static void main(String[] args) {
        Car car1 = new Car("maruti" , " white" , 2018 , "petrol");
        Family car2 = new Family("swift" , "white" , 2020 , "petrol" , "automatic");
        System.out.println(car1.type);
        Luxary car3 = new Luxary("Bmw"  , "red" ,2022 , "disel" , "manual" , 4500000);
        Family car4 = new Family("alto"  , "white" , 2018 , "petrol" , "manual");
        System.out.println(car3.brand);
//        System.out.println(car4.price);
        // we can not access price as family is the upper class and it is trying to access the data member
        //of lower class
        // lower class can acces the things related to upper class but upper class can not access
        // from the lower class

    }
}
