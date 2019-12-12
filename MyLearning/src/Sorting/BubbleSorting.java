package Sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b= {-3,-6,0,6,9,7,1,-9,-9};
		System.out.println("before sorting...");
		for(int j:b) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("before sorting...");
		bubbleSort(b);
		for(int j:b) {
			System.out.print(j+" ");
		}
	}
	
	
	public static void bubbleSort(int[] arr) {
			
		int index=arr.length-1;
		int c=1;
		while(index>0) {
			for(int i=0;i<index;i++) {c++;
				int j=i+1;
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}index--;
		}System.out.println("cc  "+c);
	}
	
	static class BubbleSort{
		int[] arr;
		int len;
		
		public BubbleSort(int[] a) {
			// TODO Auto-generated constructor stub
			len = a.length;
			arr=a;
		}
		
		
	}

}
