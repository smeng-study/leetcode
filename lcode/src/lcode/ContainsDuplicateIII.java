package lcode;

import java.util.TreeSet;

/**
 * 220. Contains Duplicate III
 * @author smeng
 *
 */

//Given an array of integers, find out whether there are two 
//distinct indices i and j in the array such that the difference 
//between nums[i] and nums[j] is at most t and the difference 
//between i and j is at most k.

public class ContainsDuplicateIII {
	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums==null||nums.length==0||k<=0) return false;
		TreeSet<Integer> tree = new TreeSet<Integer>();
        for(int i=0; i<nums.length; i++) {
        	Integer floor = tree.floor(nums[i]+t);
        	Integer ceil = tree.ceiling(nums[i]-t);
        	if(floor!=null && nums[i]<=floor || ceil!=null && nums[i]>=ceil) {
        		return true;
        	}
        	tree.add(nums[i]);
        	if(i>=k) {
        		tree.remove(nums[i-k]);
        	}
        	
        }
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,21,32,41,5,12,36,71};
		System.out.println(containsNearbyAlmostDuplicate(nums, 3,3));
	}

}
