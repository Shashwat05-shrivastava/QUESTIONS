package Maths;
import java.util.*;
public class PrimeRange {
	public static void rangePrime(int n1,int n2) {
		
		for(int i=n1;i<=n2;i++) {
			int temp=0;
			for(int j=2;j<n1-1;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0)
				System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		rangePrime(num1,num2);
	}

}
