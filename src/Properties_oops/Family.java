package Properties_oops;

public class Family extends Car{
    Family(){

    }
    String gear;
    public Family(String brand, String color, int model, String type , String gear) {
        super(brand, color, model, type);
        this.gear = gear;
    }
}
