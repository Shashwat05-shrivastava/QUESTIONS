package recursion;
import java.util.*;
public class Power {
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int pow=power(x,n-1);
		int ans=x*pow;
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the power: ");
		int n=sc.nextInt();
		System.out.println("Enter the number: ");
		int x=sc.nextInt();
		sc.close();
		System.out.println(power(x,n));

	}

}
