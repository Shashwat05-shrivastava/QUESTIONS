package recursion;
import java.util.*;
public class ZigZag {
	public static void zigzag(int n) {
		if(n==0) {
			return ;
		}
		System.out.println("Pre "+n);
		zigzag(n-1);
		System.out.println("In "+n);
		zigzag(n-1);
		System.out.println("Post "+n);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		sc.close();
		zigzag(n);
	}

}
