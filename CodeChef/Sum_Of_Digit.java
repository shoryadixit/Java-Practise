package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Sum_Of_Digit {
    static int getSumOfDig(int n) {
        int rem = 0;
        while (n != 0) {
            rem = rem + n % 10;
            n = n / 10;
        }
        return rem;
    }

    public static BigInteger getFactorial(int n) {
        BigInteger fact = BigInteger.ONE;

        return fact;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int t = Integer.parseInt(br.readLine());
        /*while (t-- != 0) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(getSumOfDig(num));
        }
        System.out.println("Enter a number for factorial : ");
        int num = Integer.parseInt(br.readLine());
        System.out.println(getFactorial(num));

        System.out.println("Enter a number to get reverse : ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println(getreverse(num1));*/
        /*for(int i =0;i<t;i++){
            long fac = 1;
            int n = Integer.parseInt(br.readLine());
            for(int j=n;j>0;--j){
                fac = fac*n;
                n = n-1;
            }
            System.out.println(fac);
        }*/
        int num = 100;
        System.out.println(getFactorial(num));
    }

    static int getreverse(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse = reverse + (num % 10);
            num = num / 10;
        }
        return reverse;
    }
}
