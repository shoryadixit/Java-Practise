package Operators;

import java.util.Scanner;

public class Serriessum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = 1;

        for (double i = 1; i <= n; i++) {
            result += 1/i;
        }
        System.out.println(result);
    }
}
