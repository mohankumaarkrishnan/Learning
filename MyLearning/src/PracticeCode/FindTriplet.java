package PracticeCode;
import java.util.Arrays;

public class FindTriplet {
	public static void main(String[] args) {
		
		int[] arr= {0,-1,-3,5,4,-5};
	
		findTriplet(arr,0);
		
	}
	
	public static void findTriplet(int[] arr,int ExpectedSum) {
		//int sum=arr[0];
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			int j=i+1,k=arr.length-1;
			int sum=arr[i];
			while(j<k) {
				sum=arr[i]+arr[j]+arr[k];
				if(sum==ExpectedSum) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					j++;
					k--;
				}else if(sum>ExpectedSum) {
					k--;
				}else {
					j++;
				}
			}
		}
		
	}
}
