package CodeChef;

import java.util.Scanner;

public class ShoeFit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if ((a == 0 && (b == 1 || c == 1)) || (a == 1 && (b == 0 || c == 0))) {
                System.out.println(1 + "\n");
            }
            else {
                System.out.println(0 + "\n");
            }
        }
    }
}
