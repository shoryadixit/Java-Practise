package SomeProblem;

import java.util.Scanner;

public class SameStringReplace {
	public static String remove(String s1, String s2) {
		
		if(s1.contains(s2)) {
			String s3 = s2 + "";
			s1 = s1.replaceAll(s3, "");
			
			s3 = "" + s2;
			s1 = s1.replaceAll(s3, "");
		}
		
		return s1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String s1 = scan.nextLine();
		System.out.println("Enter 2nd String : ");
		String s2 = scan.nextLine();
		
		System.out.println(remove(s1, s2));
		
		scan.close();
	}
}
