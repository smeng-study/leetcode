package lcode;

/**
 * 387. First Unique Character in a String
 * @author smeng
 *
 */

//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
//
//Examples:
//
//s = "leetcode"
//return 0.
//
//s = "loveleetcode",
//return 2.
		
public class FirstUniqueCharacterinaString {
	public static int firstUniqChar(String s) {
		int num[] = new int[26];
		int res = -1;
		for(int i=0; i<s.length(); i++) {
			num[s.charAt(i)-'a']++;
		}
		for(int i=0; i<s.length(); i++) {
			if(num[s.charAt(i)-'a']==1) {
				res = i;
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbseeaqw";
		System.out.print(firstUniqChar(s));
	}

}
