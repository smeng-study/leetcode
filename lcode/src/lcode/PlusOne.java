package lcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 66. Plus One
 * @author smeng
 *
 */

//Given a non-negative number represented as an array of digits, plus one to the number.
//
//The digits are stored such that the most significant digit is at the head of the list.

public class PlusOne {
	
	public static int[] plusOne(int[] digits) {
		List<Integer> res = new ArrayList<Integer>();
		int carry = (digits[digits.length-1]+1)/10;
		res.add((digits[digits.length-1]+1)%10);

        for(int i=digits.length-2; i>=0; i--) {
        	int sum = (digits[i]+carry)%10;
        	carry = (digits[i]+carry)/10;
        	res.add(sum);
        }
        if(carry!=0) {
        	res.add(carry);
        }
        int[] r = new int[res.size()];
        for(int i=0; i<res.size(); i++) {
        	r[i] = res.get(res.size()-i-1);
        }
        return r;
    }
	
	public static int[] plusOne2(int[] digits) {
		int len = digits.length;
		for(int i=len-1; i>=0; i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		//initial array with "0"
		int newarray[] = new int[len+1];
		//only need to make first 1 for 999*
		newarray[0] = 1;
		return newarray;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digits[] = {1,3,5,8,9};
		digits = plusOne2(digits);
		for(int n:digits){
			System.out.println(n);
		}
		
	}

}
