package Exception_handling;

public class Custom_exception {
    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age must be 18 ");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        }catch(InvalidAgeException e){
            System.out.println("exception caught  "  + e.getMessage());
        }
    }
}
