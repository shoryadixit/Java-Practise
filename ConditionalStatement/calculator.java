package ConditionalStatement;

import java.util.Scanner;

public class calculator {
	public static int calculate(int a, int b, char c) {
		int result = 0;
		switch(c){
		case('+'):
			result = a + b;
			break;
		case('-'):
			result = a - b;
			break;
		case('*'):
			result = a*b;
			break;
		case('/'):
			result = a/b;
			break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st Number to calculate : ");
		int a = scan.nextInt();
		
		System.out.println("Enter 2nd Number to calculate : ");
		int b = scan.nextInt();
		
		System.out.println("Enter the operation : ");
		scan.nextLine();
		char operation = scan.nextLine().charAt(0);

		 System.out.println(calculate(a, b, operation));
		 scan.close();
	}
}