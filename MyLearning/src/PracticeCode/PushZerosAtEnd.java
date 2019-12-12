package PracticeCode;

public class PushZerosAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = { 1, 0, 0, 0, 3, 9, 2, 0, 7, 8, 0 };
		int arr[] = {1,0,0,0,1,0,1,0,0}; 
				
		System.out.println("Before sorting...");
		System.out.println();
		for (int i : arr) {

			System.out.print(i + " ");
		}
		pushZerosAtEnd(arr);
		System.out.println();
		System.out.println("After sorting...");
		System.out.println();
		for (int i : arr) {

			System.out.print(i + " ");
		}
	}

	public static void pushZerosAtEnd(int[] arr) {
		/*
		 * Your class should be named PushZerosAtEnd Don't write main(). Don't read
		 * input, it is passed as function argument. No need to return or print the
		 * output. Taking input and printing output is handled automatically.
		 */

		/*
		 * int i=0,j=i+1;
		 * 
		 * while(j<arr.length){ if(arr[i]!=0) { i++; j++; }else{ if(arr[j]==0) { j++; }
		 * else { int temp=arr[i]; arr[i]=arr[j]; arr[j]=temp; i++; j=i+1; } }
		 * 
		 * }
		 */
		/*
		 * int i =0; for(int j=0;j<arr.length;j++) { if(arr[j]!=0) { arr[i++]=arr[j]; }
		 * 
		 * } while(i<arr.length) { arr[i++]=0; }
		 */

		int i = 0, j = arr.length - 1;

		while (i < j) {
			if (arr[i] == 0) {
				i++;
			} else if (arr[j] == 1) {
				j--;
			} else {
				arr[i] = 0;
				arr[j] = 1;
				i++;
				j--;
			}

		}

	}

}
