package Collection_framework;

import java.util.WeakHashMap;

public class WeakhashmapDemo {
    public static void main(String[] args) {
        WeakHashMap<String , Image> imageCache = new WeakHashMap<>();
        imageCache.put( new String("img1") , new Image("Image 1"));
        imageCache.put( new String("img2")  , new Image("Image 2"));
        System.out.println(imageCache);
        System.gc(); // only suggests jvm to call garbage collector , not sure // not used
        // only to test and demo
        simulateApplicationRunning();
        System.out.println("catch after running (some entries may be deleted )" + imageCache);

    }
    public static void simulateApplicationRunning(){
        try{
            System.out.println("simulate application running ");
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
class Image {
    private String name ;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return   name ;
    }
}


