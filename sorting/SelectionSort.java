package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[]arr1= {2,3,1,4,5};
		selectionSort(arr1);
		System.out.println(Arrays.toString(arr1));

	}

}
