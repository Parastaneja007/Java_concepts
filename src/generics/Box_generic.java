package generics;

public class Box_generic<T extends Number>{
    private  T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
