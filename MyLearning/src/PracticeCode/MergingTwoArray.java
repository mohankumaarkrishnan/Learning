package PracticeCode;

public class MergingTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] a= {1,5,9,15,27,35};
			int b[]= {2,4,6,8,16,19,25,29,33};
			
			int[] result=mergeArray(a, b);
			for(int r:result) {
				System.out.print(r+"-");
			}
		
	}
	
	public static int[] mergeArray(int[] a,int[] b) {
		int a_len=a.length;
		int b_len=b.length;
		int c_len=a_len+b_len;
		int[] c=new int[c_len];
		int i=0,j=0;
		for(int k=0;k<c_len;k++) {
			if(i>=a_len) {
				c[k]=b[j];
				j++;
			}
			else if(j>=b_len) {
				c[k]=a[i];
				i++;
			}
			else if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
			}
			else {
				c[k]=b[j];
				j++;
			}
		}
		
		
		
		return c;
	}

}
