package CodeChef;

import java.util.Scanner;

public class TheLife {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int test = sc.nextInt();
        while (test != 42){
            System.out.println(test);
            test = sc.nextInt();
        }
    }
}
