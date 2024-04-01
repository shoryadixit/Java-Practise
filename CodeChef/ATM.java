package CodeChef;

import java.util.Scanner;

public class ATM {
    public static void main(String args[]) {
        int x;
        float y,z;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextFloat();
        if(x%5==0 && x<(y-0.50))
        {
            float a =(float)(x+0.50);
            z=(float)y-a;
            System.out.printf("%.2f",z);
        }
        else {
            System.out.printf("%.2f", y);
        }
    }
}