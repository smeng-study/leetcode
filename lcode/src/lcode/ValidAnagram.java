package lcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 * @author smeng
 *
 */

//Given two strings s and t, write a function to determine if t is an anagram of s.
//
//For example,
//s = "anagram", t = "nagaram", return true.
//s = "rat", t = "car", return false.
//
//Note:
//You may assume the string contains only lowercase alphabets.
//
//Follow up:
//What if the inputs contain unicode characters? How would you adapt your solution to such case?
		
public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		if(s==null||t==null||s.length()!=t.length()) return false;
        int[] map = new int[26];
        for(int i=0; i<s.length(); i++) {
        	map[s.charAt(i)-'a']++;
        }
        for(int j=0; j<t.length(); j++) {
        	if(--map[t.charAt(j)-'a']<0) return false;
        }
        return true;
    }
	public static boolean followUpIsAnagram(String s, String t) {
		if(s==null||t==null||s.length()!=t.length()) return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++) {
        	char c = s.charAt(i);
        	if(map.containsKey(c)) {
        		map.put(c, map.get(c)+1);
        	}else {
        		map.put(c, 1);
        	}
        }
        for(int j=0; j<t.length(); j++) {
        	char c = t.charAt(j);
        	if(map.containsKey(c)) {
        		map.put(c, map.get(c)-1);
        		if(map.get(c)<=0) map.remove(c);
        	}else {
        		return false;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asdsd";
		String t1 = "ddsas";
		String t2 = "sdffw";
		System.out.println(followUpIsAnagram(s,t1));
		System.out.println(followUpIsAnagram(s,t2));
	}

}
