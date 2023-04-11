package Maths;
import java.util.*;

public class Prime {
	public static void isPrime(int num) {
		boolean flag=false;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				flag=true;
		}
		if(!flag)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not Prime");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		isPrime(number);
	}
		
}
