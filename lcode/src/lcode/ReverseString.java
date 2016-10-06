package lcode;

/**
 * 
 * @author smeng
 * 
 */

// Write a function that takes a string as input and returns the string reversed.
//
// Example:
// Given s = "hello", return "olleh".

public class ReverseString {
	public static String reverseString(String s) {
		if(s==null || s.length()==0) {
			return s;
		}
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asdafe";
		System.out.println(reverseString(s));
	}

}
