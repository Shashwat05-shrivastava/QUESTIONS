package Maths;
import  java.util.*;
public class LcmHcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int on1=n1;
		int on2=n2;
		while(n1%n2 !=0) {
			int rem=n1%n2;
			n1=n2;
			n2=rem;
		}
		int gcd=n2;
		System.out.println(gcd);
		int lcm=(on1*on2)/gcd;
		System.out.println(lcm);
		sc.close();
	}

}
