package SortAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b= {-3,-6,0,6,9,7,1,-9,-9};
		System.out.println("before sorting...");
		for(int j:b) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		selectionSort(b);System.out.println("before sorting...");
		for(int j:b) {
			System.out.print(j+" ");
		}
	}

	public static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int lastIndex=arr.length-1;
		int c=0;
		while(lastIndex>0) {
			int max=Integer.MIN_VALUE;
			int j=-1;
			for(int i=0;i<lastIndex;i++) {c++;
				if(arr[i]>max) {
					max=arr[i];
					j=i;
				}
			}
			int temp=arr[j];
			arr[j]=arr[lastIndex];
			arr[lastIndex]=temp;
			lastIndex--;
		}System.out.println("cc  "+c);
	}

}
