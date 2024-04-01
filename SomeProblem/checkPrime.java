package SomeProblem;
import ConditionalStatement.ForLoopDemo;
import java.util.Scanner;

public class checkPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		checkPrime obj = new checkPrime();
		
		int a = sc.nextInt();
		boolean b = obj.isprime(a);
		if (b == true){
			System.out.println("The number " + a + " is Prime");
		}
		else{
			System.out.println("The number " + a + " is not Prime");
		}
	}

public boolean isprime(int num){
	boolean prime = true;
	for (int i = 2; i * i < num; i++) {
		if(num % i == 0){
			prime = false;
			break;
		}
	}
	return prime;
}

}