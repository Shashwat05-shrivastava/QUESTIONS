package recursion;
import  java.util.*;
public class PrintIncreasing {
	public static  void printIncreasing(int n) {
		if(n==0) {
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		printIncreasing(n);

	}

}
