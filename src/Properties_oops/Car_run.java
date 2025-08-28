package Properties_oops;

public class Car_run {
    public static void main(String[] args) {
        Car car1 = new Car("maruti" , " white" , 2018 , "petrol");
        Family car2 = new Family("swift" , "white" , 2020 , "petrol" , "automatic");
        System.out.println(car1.type);
        Luxary car3 = new Luxary("Bmw"  , "red" ,2022 , "disel" , "manual" , 4500000);
        System.out.println(car3.brand);

    }
}
