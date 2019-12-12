package SortAlgorithms;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] b= {-3,-6,0,6,9,-4,7,1};
		System.out.println("before sorting...");
		for(int j:b) {
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("before sorting...");
		mergeSort(b,0,b.length-1);
		for(int j:b) {
			System.out.print(j+" ");
		}
	}

	private static void mergeSort(int[] b,int l,int h) {
		// TODO Auto-generated method stub
	
		  if(l<h) {
		 
			int mid=(l+h)/2;
			mergeSort(b, l, mid);
			mergeSort(b, mid+1, h);
			merge(b, l, mid, h);
		  }
		
	}
	private static void merge(int[] b,int l,int mid,int h) {
		/*
		 * if(b[mid-1]<=b[mid]) { return; }
		 */
		int i=l,j=mid+1,k=0;
		int[] temp=new int[h-l+1];
		
		while(i<=mid&&j<=h) {
			if(b[i]<=b[j]) {
				temp[k++]=b[i++];
			}else {
				temp[k++]=b[j++];
			}
		}	
		while(i<=mid) {
			temp[k++]=b[i++];
		}
		while(j<=h) {
			temp[k++]=b[j++];
		}
		
		
		//index=l;
		k=l;
		while(k<=h) {
			b[k]=temp[k-l];
			k++;
		}
	}

}
