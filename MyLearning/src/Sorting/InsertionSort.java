package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b= {-3,-6,0,6,9,7,1,-9,-9};
		System.out.println("before sorting...");
		for(int j:b) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("before sorting...");
		insertionSort(b);
		for(int j:b) {
			System.out.print(j+" ");
		}
	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int firstIndex=1;
		while(firstIndex<arr.length) {
			int element=arr[firstIndex];
			int i;
			for(i=firstIndex;i>0&&arr[i-1]>element;i--) {
				arr[i]=arr[i-1];			
			}
			arr[i]=element;
			firstIndex++;
		}
	}

}
