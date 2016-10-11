package lcode;

/**
 * 415. Add Strings
 * @author smeng
 *
 */

//Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.
//
//Note:
//
//The length of both num1 and num2 is < 5100.
//Both num1 and num2 contains only digits 0-9.
//Both num1 and num2 does not contain any leading zero.
//You must not use any built-in BigInteger library or convert the inputs to integer directly.

public class AddStrings {
	public static String addStrings(String num1, String num2) {
		if(num1.length()==0) return num2;
		if(num2.length()==0) return num1;
		//toCharArray is O(n), but charAt is O(1)
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		int i=num1.length()-1, j=num2.length()-1;
		while(i>=0 || j>=0) {
			int sum = carry;
			if(i>=0) {
				sum += num1.charAt(i)-'0';
				i--;
			}
			if(j>=0) {
				sum += num2.charAt(j)-'0';
				j--;
			}
			sb.append(sum%10);
			carry = sum/10;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "123";
		String s2 = "239";
		System.out.print(addStrings(s1,s2));
				
	}

}
