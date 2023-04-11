package linkedlist;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		while(flag) {
			System.out.println("1.Add At First");
			System.out.println("2.Add At Last");
			System.out.println("3.Add At Pos");
			System.out.println("4.Del At First");
			System.out.println("5.Del At Last");
			System.out.println("6.Del At Pos");
			System.out.println("7.View List");
			System.out.println("8.Exit");
			
			int val,pos;
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the value: ");
				val=sc.nextInt();
				l.AddAtFirst(val);
				break;
			case 2:
				System.out.println("Enter the value: ");
				val=sc.nextInt();
				l.AddAtLast(val);
				break;
			case 3:
				System.out.println("Enter the value and pos: ");
				val=sc.nextInt();
				pos=sc.nextInt();
				l.AddAtPos(val, pos);
				break;
			case 4:
				System.out.println("Deleting from First.....");
				l.DeleteAtFirst();
				break;
			case 5:
				System.out.println("Deleting from Last....");
				l.DeleteAtLast();
				break;
			case 6:
				System.out.println("Deleting from given position....");
				System.out.println("Enter the required Pos");
				pos=sc.nextInt();
				l.DeleteAtPos(pos);
				break;
			case 7:
				l.view();
				break;
			case 8:
				flag=false;
				break;
			default:
				System.out.println("Enter valid choice....");
			}
		}
		sc.close();
	}
}
