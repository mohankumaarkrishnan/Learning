package SearchAlgorithms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,7,4,3,9,8,6};
		int k=linearSearch(a, 6);
		System.out.println(k);
	}
	
	public static int linearSearch(int[] b,int value) {
		for(int i=0;i<b.length;i++) {
			if(b[i]==value) {
				return i;
			}
		}
			
		return -1;
	}
}
