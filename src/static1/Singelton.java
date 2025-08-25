package static1;

public class Singelton {
    private Singelton() {
    }
    private static Singelton instance;
    public static Singelton getInstance(){
        // check wheather a object is being created or not
        if(instance == null){
            instance = new Singelton();
        }
         return instance;
    }

    public static void main(String[] args) {
        Singelton obj = Singelton.getInstance();
        Singelton obj2 = Singelton.getInstance();
        Singelton obj3 = Singelton.getInstance();
        // all three reference variable are pointing to just one object

    }


}


