import java.util.*;

public class InvalidNumberException extends Exception {
    public InvalidNumberException(String txt) {
        super(txt);
    }
}

class ExceptionHandling {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number input");
        int inp = sc.nextInt();
        System.out.println("The Entered input -> " + inp);

        // if (inp == 123) {
        //     throw new InvalidNumberException("Inalid Number input");
        // }123
    }
}
