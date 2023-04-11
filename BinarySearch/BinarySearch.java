package BinarySearch;

public class BinarySearch {
	
	public int bSearch(int[] arr,int val) {
		int f=0;
		int l=arr.length-1;
		int mid=(f+l)/2;
		//{1,2,3,4,5}
		while(f<=l) {
			if(arr[mid]<val) {
				f=mid+1;
			}else if(arr[mid]==val) {
				System.out.println("The element is found at index:"+mid);
				break;
			}else {
				l=mid-1;
			}
			mid=(f+l)/2;
		}
		return mid;
	}
}
