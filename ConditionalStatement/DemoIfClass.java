package ConditionalStatement;

public class DemoIfClass {
	public static void main(String[] args) {
		int age = 38;
		
		//Now use if Condition
		
		if (age >= 10) {
			System.out.println("You can vote Now!");
		}
		
		//Now use If-else Condition
		
		int petals = 5;
		
		if (petals % 2 == 0) {
			System.out.println("Wrong!");
		}
		else {
			System.out.println("Right!");
		}
		
		//Now use else-if Condition
		
		int number = 23;
		if (number <= 10) {
			System.out.println("Between 0-10");
		}
		
		else if (number > 10 && number <= 20) {
			System.out.println("Between 10-20");
		}
		
		else if (number > 20 && number <= 30) {
			System.out.println("Between 20-30");
		}
		//If you not use else block not any problem
		
		//Now Use Ternary Operator
		
		int a = 15;
		int b = 6;
		
		int bignumber;
		//to find greater number by if-else condition
		if (a > b) {
			bignumber = a;
		}
		else {
			bignumber = b;
		}
		
		System.out.println("Bigger number B/w A and B is : " + bignumber);
		
		//Now use ternary operator to solve this operator
		
		bignumber = a > b ? a : b;
		
		System.out.println("calculate by ternarry operator the big number is : " + bignumber);
		
	}

}
