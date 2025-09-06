package abstract_05;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        Daughter daughter = new Daughter();
        son.career();
        daughter.college();
//        Parent p = new Parent(); we can not create object of parent class
        Parent p = new Son(); // but we can create reference like this
    }
}
