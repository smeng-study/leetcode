package lcode;

/**
 * 
 * @author smeng
 *
 */
//136. Single Number
//Given an array of integers, every element appears twice except for one. Find that single one.
//
//Note:
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		int res = 0;
		for(int n: nums) {
			res ^= n;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{2,3,2,4,3,5,1,4,1};
		System.out.println(singleNumber(nums));
	}

}
