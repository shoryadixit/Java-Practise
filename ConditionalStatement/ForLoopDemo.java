package ConditionalStatement;
import java.util.Scanner;

public class ForLoopDemo {
	public static void main(String[] args) {
		//Now Print hello world 5 times
		Scanner sc = new Scanner(System.in);
		
		if(true) {
			System.out.println("If you want to print" +  "Hello World" + "five times type if yes then type Y/y "
					+ "or not type N/n");
			String s = sc.nextLine();
			if (s.contains("Y") | s.contains("y")) {
				for(int i = 1; i <= 5; i++) {
					System.out.println("Hello World!");
				}
			}
			else {
				System.out.println("Ok Done!");
			}
			
			
			
			System.out.println("If you want to print even numbers between  1 to 10 type Y/y else not type N/n");
			String s1 = sc.nextLine();
			if(s1.contains("Y") | s1.contains("y")){
				System.out.println("Numbers between 1 to 10 is :");
				for(int i = 2; i <= 10; i = i+2) {
					System.out.println(i);
				}
			}
			else {
				System.out.println("Ok Done!");
			}
			
			
			
			System.out.println("If you want to print a table of any number if yes type Y/y or not type N/n");
			String s2 = sc.nextLine();
			
			if(s2.contains("Y") | s2.contains("y")) {
				System.out.println("Enter  a number to get that table");
				int tableOf = sc.nextInt();
				for (int i = 1; i <= 10; i++) {
					System.out.println(tableOf + " x " + i + " = " + tableOf*i);
				}
			}
			else {
				System.out.println("Ok Done!");
			}
			
			
			
			
			
			System.out.println("If yoy want to find any number of factorial type Y/y for Yes and N/n for No");
			String s3 = sc.nextLine();
			if(s3.contains("Y") | s3.contains("y")) {
			
				int factorialnumber = sc.nextInt();
				int factorial = 1;
				for(int n = factorialnumber; n >= 1; n--) {
					factorial = factorial * n;
				}
				System.out.println("Factorial of " + factorialnumber + " is " + factorial);
			}
			else {
				System.out.println("Ok Done!");
			}
			
			
			
			
			
			
			System.out.println("If yoy want to print any fibonacci numbers type Y/y for Yes and N/n for No");
			String s4 = sc.nextLine();
			if(s4.contains("Y") | s4.contains("y")) {
				System.out.println("Enter a number that want fibonacci sereis");
				int number = sc.nextInt();
				int a = 0;
				int b = 1;
				System.out.print(a + " ");
				System.out.print(b + " ");
				
				for(int i = 0; i< number-2; i++) {
					int c = a + b;
					System.out.print(c + " ");
					a=b;
					b=c;
				}
			}
			else {
				System.out.println("Ok Done!");
			}
			
			
			System.out.println();
			System.out.println("If you want to chack your number is prime type Y/y for yes or N/n for not");
			String s5 = sc.nextLine();

			if(s5.contains("Y") | s5.contains("y")) {
				boolean isprime = true;
				int num = sc.nextInt();
				
				for(int i = 2; i * i < num; i++) {
					
					if(num % i == 0) {
						isprime = false;
						break;
					}
				}
				if(num < 2) isprime = false;
				
				if(isprime == true) {
					System.out.println("Your number " + num + " is Prime");
				}
				sc.close();
			}
		}
	}
}