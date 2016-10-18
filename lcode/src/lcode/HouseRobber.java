package lcode;

/**
 * 198. House Robber
 * @author smeng
 *
 */

//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

public class HouseRobber {
	
	public static int rob(int[] nums) {
		if(nums==null || nums.length<1) return 0;
		if(nums.length==1) return nums[0];
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<nums.length; i++) {
        	dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money[] = {2,4,1,5,2,13,9};
		System.out.println(rob(money));
	}

}
