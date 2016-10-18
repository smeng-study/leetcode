package lcode;

/**
 * 345. Reverse Vowels of a String
 * @author smeng
 *
 */

//Write a function that takes a string as input and reverse only the vowels of a string.
//
//Example 1:
//Given s = "hello", return "holle".
//
//Example 2:
//Given s = "leetcode", return "leotcede".
//
//Note:
//The vowels does not include the letter "y".

public class ReverseVowelsofaString {
	private static String vowels = "aeiouAEIOU";
	public static String reverseVowels(String s) {
		char[] c = s.toCharArray();
        int l = 0;
        int r = s.length()-1;
        while(l<r) {
        	if(vowels.indexOf(s.charAt(l))!=-1) {
        		while(vowels.indexOf(s.charAt(r))==-1) {
        			r--;
        		}
        		if(l<r){
        			c[l] = s.charAt(r);
        			c[r] = s.charAt(l);
        			r--;
        		}
        	}
        	l++;
        }
        //Arrays.toStirng(c), don't work if only do c.toString, Java's toString() for an array is to print [, followed by a character representing the type of the array's elements (in your case C for char), followed by @ then the "identity hash code" of the array (think of it like you would a "memory address").
        return String.valueOf(c);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ai";
		System.out.print(reverseVowels(s));
	}

}
