package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class HighestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 10; i >= 0; i--){
            if(n%i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}