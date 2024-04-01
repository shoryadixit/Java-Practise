package Operators;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        //bitwise OR operation
        int c = a | b;
        //bitiwse AND operation
        int d = a & b;
        System.out.println(c + " " + d);
        //bitwise right shift operator
        int e = a << 1;
        System.out.println(e);
    }
}
