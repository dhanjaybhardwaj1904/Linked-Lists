package linkedList2L;

public class QuestionsOnRecursion {
    
	public static String[] subsequence(String str) {
		
		if(str.length() == 0) {
			String[] ans = new String[1];
			ans[0] = "";
			return ans;
		}
		
		String[] smallAns = subsequence(str.substring(1));
		String[] myAns = new String[2*smallAns.length];
		
		for(int i = 0; i < smallAns.length; i++) {
			myAns[i] = smallAns[i];
			myAns[i + smallAns.length] = str.charAt(0) + smallAns[i];
		}
		
		return myAns;
	}
	public static void main(String[] args) {
		String[] ans = subsequence("abcd");
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
