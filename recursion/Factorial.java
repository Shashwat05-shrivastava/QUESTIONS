package recursion;
import java.util.*;
public class Factorial {
	public static int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		int fact=factorial(n-1);
		int ans=n*fact;
		return ans;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		System.out.println(factorial(n));
	}

}
