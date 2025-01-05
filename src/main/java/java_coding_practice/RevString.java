package java_coding_practice;

public class RevString {
	
	
	public static void main(String[] args) {
		
		String str="Hi Vasant, how are you";
		String revStr="";
		
		for(int i=str.length()-1; i>=0;i--) {
			char ch=str.charAt(i);
			revStr=revStr+ch;
		}
		System.out.println(revStr);
	}

}
