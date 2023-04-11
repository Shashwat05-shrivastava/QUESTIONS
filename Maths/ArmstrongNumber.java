package Maths;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int digits=0;
		int rem=0;
		while(temp!=0) {
			temp=temp/10;
			digits=digits+1;
		}
		System.out.println(digits);
		int temp2=num;
		int ans=0;
		while(temp2!=0) {
			int mul=1;
			rem=temp2%10;
			for(int i=1;i<=digits;i++) {
				mul=mul*rem;
			}
			ans=ans+mul;
			temp2=temp2/10;
		}
		System.out.println(ans);
		if(ans==num)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
		sc.close();

	}

}
