package CodeChef;

import java.util.Scanner;

public class Remainder {
    static int getRemainder(int a, int b) {
        int response = 0;
        response = a % b;
        return response;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(getRemainder(a, b));
        }
    }
}
