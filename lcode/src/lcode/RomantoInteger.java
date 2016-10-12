package lcode;

/**
 * 13. Roman to Integer
 * @author smeng
 *
 */

//Given a roman numeral, convert it to an integer.
//
//Input is guaranteed to be within the range from 1 to 3999.

public class RomantoInteger {
	private static String roman = "IVXLCDM";
	private static int[] nums = {1,5,10,50,100,500,1000};
	public static int romanToInt(String s) {
        int preIdx = roman.indexOf(s.charAt(0));
        int res = nums[preIdx];
        for(int i=1; i<s.length(); i++) {
        	int idx = roman.indexOf(s.charAt(i));
        	if(idx<=preIdx) {
        		res += nums[idx];
        	}else {
        		res += nums[idx] - 2*nums[preIdx];
        	}
        	preIdx = idx;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "XXXIV";
		String s2 = "XCIX";
		System.out.println(romanToInt(s));
		System.out.println(romanToInt(s2));
	}

}
