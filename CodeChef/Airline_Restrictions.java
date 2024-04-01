package CodeChef;

import java.io.IOException;
import java.util.Scanner;

public class Airline_Restrictions {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            boolean flag = false;
            if(a+b<=d &&c<=e)
                flag = true;
            if(b+c<=d && a<=e)
                flag = true;
            if(a+c<=d && b<=e)
                flag = true;
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}