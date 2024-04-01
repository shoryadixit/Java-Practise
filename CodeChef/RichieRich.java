package CodeChef;

import java.util.Scanner;

public class RichieRich {
    static int rich(int a, int b, int x){
        return Math.abs((a-b)/x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(rich(a, b, x));
        }
    }
}
