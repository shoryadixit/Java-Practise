package SomeProblem;

import java.util.Scanner;

public class sumSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(long i = 1; i * i <= a; i++){
            for(long j = 1; j * j <= a; j++){
                if(i * i + j * j == a){
                    System.out.println("Yes, " + a + " is a sum of perfect square.");
                }
                else{
                    System.out.println("No, " + a + " is not a sum of perfect square");
                    break;
                }
            }
        }
    }
}