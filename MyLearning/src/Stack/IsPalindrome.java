package Stack;

import java.util.LinkedList;

public class IsPalindrome {
	
	public static boolean isPalindrome(String string) {
		LinkedList<Character> stack = new LinkedList<>();
		StringBuilder noPunctuationString = new StringBuilder();
		String lowerCase=string.toLowerCase();
		for(int i=0;i<string.length();i++) {
			char c=(lowerCase.charAt(i));
			if(c>='a'&&c<='z') {
				stack.push(c);
				noPunctuationString.append(c);
			}
		}
		StringBuilder reverseString=new StringBuilder();
		while(!stack.isEmpty()) {
			reverseString.append(stack.pop());
		}
		
		return noPunctuationString.toString().equals(reverseString.toString());
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello>";
		String s1="hello?olleh?";
		String s2="ihhi";
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome(s2));
	}

}
