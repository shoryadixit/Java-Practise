package ConditionalStatement;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rating = sc.nextInt();
		
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Bad Reviews");
			break;
		case 3:
			System.out.println("Average");
			break;
		case 4:
		case 5:
			System.out.println("Good Reviews");
			break;
		default:
			System.out.println("Best");
		}
		
		sc.close();
	}

}
