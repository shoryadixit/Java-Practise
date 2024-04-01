package CodeChef;

import javax.management.StringValueExp;
import java.util.Scanner;

public class Equinox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            String s2;
            String s1 = "EQUINOX";
            while (n != 0){
                s2 = sc.nextLine();
                if (s2.startsWith(String.valueOf(s1.charAt(0)))){
                    a += 1;
                } else {
                    b += 1;
                }
                n--;
            }
            if (a == b){
                System.out.println("DRAW");
            } else if (a > b){
                System.out.println("SARTHAK");
            } else {
                System.out.println("ANURADHA");
            }
            t--;
        }
    }
}
