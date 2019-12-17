package PracticeCode;

public class IterativeFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(getFibonacci(5));
	}
	
	public static int getFibonacci(int n) {
		int a=0,b=1,c=0;
		for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}

}
