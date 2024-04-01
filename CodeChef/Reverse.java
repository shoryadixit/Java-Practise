package CodeChef;

import java.util.Scanner;

public class Reverse {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int test = sc.nextInt();
        while (test != 0) {
            int n = sc.nextInt();
            int r = 0;
            while (n != 0) {
                int digit = n % 10;
                r = r * 10 + digit;
                n = n / 10;
            }
            System.out.println(r);
            test--;
        }
    }
}