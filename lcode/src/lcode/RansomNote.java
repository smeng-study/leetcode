package lcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 383. Ransom Note
 * @author smeng
 *
 */

public class RansomNote {
	public static boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		if(ransomNote.length()>magazine.length()) return false;
		for(char c:magazine.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		for(char c:ransomNote.toCharArray()) {
			if(map.containsKey(c)) {
				int tmp = map.get(c);
				if(tmp<=0) {
					return false;
				}else {
					map.put(c, tmp-1);
				}
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String magazine = "asbbasddd";
		String n1 = "asbbdd";
		String n2 = "aasbbdddd";
		System.out.println(canConstruct(n1,magazine));
		System.out.println(canConstruct(n2,magazine));
	}

}
