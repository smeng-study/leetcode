package lcode;

import java.util.HashSet;

/**
 * 409. Longest Palindrome
 * @author smeng
 *
 */

//Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
//
//This is case sensitive, for example "Aa" is not considered a palindrome here.
//
//Note:
//Assume the length of given string will not exceed 1,010.

public class LongestPalindrome {
	private static HashSet<Character> set = new HashSet<Character>();
	public static int longestPalindrome(String s) {
		if(s==null || s.length()==0) return 0;
		int res = 1;
		for(char c:s.toCharArray()) {
			if(set.contains(c)) {
				res += 2;
				set.remove(c);
			}else {
				set.add(c);
			}
		}
		return res>s.length()?s.length():res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asddsaAdoooo";
		System.out.print(longestPalindrome(s));
	}

}
