package PracticeCode;

public class RecursiveFibonacci {
	public static void main(String[] args) {
		
		System.out.println(getFibonacci(5));
	}
	public static int getFibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		return getFibonacci(n-2)+getFibonacci(n-1);
	}
}
