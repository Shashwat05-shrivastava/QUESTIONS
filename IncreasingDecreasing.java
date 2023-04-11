package recursion;
import  java.util.*;
public class IncreasingDecreasing {
	public static void increasingDecreasing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		increasingDecreasing(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number: ");
		int n=sc.nextInt();
		sc.close();
		increasingDecreasing(n);

	}

}
