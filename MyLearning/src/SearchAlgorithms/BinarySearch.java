package SearchAlgorithms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		Arrays.sort(a);
		int k=binarySearch(a, 6);
		System.out.println(k);
	}
	
	public static int binarySearch(int[] b,int value) {
		int result=-1;
		int l=0;
		int h=b.length;
		while(l<=h) {
			int mid=(l+h)/2;
			
			if(b[mid]==value) {
				result=mid;
				break;
			}else if(b[mid]>value){
				h=mid;
			}else {
				l=mid+1;
			}
		}
		return result;
	}

}
