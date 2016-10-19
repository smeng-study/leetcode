package lcode;

/**
 * 213. House Robber II
 * @author smeng
 *
 */

//After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.
//
//Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

public class HouseRobberII {
	public static int rob(int[] nums) {
		if(nums==null || nums.length==0) return 0;
		if(nums.length==1) return nums[0];
        return Math.max(robmore(nums,0,nums.length-2), robmore(nums,1,nums.length-1));
    }
	
	private static int robmore(int[] nums, int start, int end) {
		int include = 0;
		int exclude = 0;
        for(int i=start; i<=end; i++) {
        	int in = include, ex = exclude;
            include = ex + nums[i]; // rob i
            exclude = Math.max(ex, in); // not rob for i
        }
        return Math.max(include, exclude);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money[] = {1,2,4,2,6,4};
		System.out.println(rob(money));
	}

}
