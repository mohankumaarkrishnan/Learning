package Dec19;

public class LargestSubString {

	public static String getLargestSubString(String firstString,String secondString) {
		String result = "No Common substring";
		if(firstString.length()==0||secondString.length()==0) {
			return result;
		}
		int result_len=0;
		int len=firstString.length();
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<=len;j++) {
				String subString=firstString.substring(i, j);
				if(secondString.contains(subString)&&result_len<subString.length()) {
					result=subString;
					result_len=subString.length();
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(LargestSubString.getLargestSubString("", "xyzsaabcd"));
		
	}
	
}
