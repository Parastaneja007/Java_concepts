package Properties_oops;

public class Luxary extends Family{
    int price;
    public Luxary(String brand, String color, int model, String type, String gear , int price) {
        super(brand, color, model, type, gear);
        this.price = price;
    }
}