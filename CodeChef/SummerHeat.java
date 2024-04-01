package CodeChef;

import java.io.IOException;
import java.util.Scanner;

public class SummerHeat {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int xa, xb, Xa, Xb;
            xa = sc.nextInt();
            xb = sc.nextInt();
            Xa = sc.nextInt();
            Xb = sc.nextInt();
            System.out.println((Xa/xa) + (Xb/xb));
        }
    }
}
