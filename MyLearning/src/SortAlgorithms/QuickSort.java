package SortAlgorithms;

public class QuickSort {
	public static void main(String[] args) {
		int[] b= {-3,-6,0,6,9,7,1,-9};
//		int[] b= {-3,-6,0};
		System.out.println("before sorting...");
		for(int j:b) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("before sorting...");
		quickSort(b,0,b.length-1);
		for(int j:b) {
			System.out.print(j+" ");
		}
	}

	private static void quickSort(int[] b, int l, int h) {
		// TODO Auto-generated method stub
		if(l<h) {
			int pivotIndex=	partition(b,l,h);
			quickSort(b, l, pivotIndex);
			quickSort(b, pivotIndex+1, h);
			
		}
	}
	private static int partition(int[] b, int l, int h) {
		// TODO Auto-generated method stub
		int pivot=b[l];
		int i=h;
		int j=h;
		while(j>l) {
					
			
			if(b[j]>=pivot) {
				if(i!=j) {
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
				i--;
			}
			j--;
			
		}
		int temp=b[i];
		b[i]=b[l];
		b[l]=temp;
		
		
		return i;
	}
}
