package Maths;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<=num;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
		    b=c;		    
		}

	}

}
