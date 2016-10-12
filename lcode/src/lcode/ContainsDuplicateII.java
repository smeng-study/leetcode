package lcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 219. Contains Duplicate II
 * @author smeng
 *
 */

//Given an array of integers and an integer k, 
//find out whether there are two distinct indices i and j 
//in the array such that nums[i] = nums[j] and the difference 
//between i and j is at most k.

public class ContainsDuplicateII {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++) {
        	if(i>k) {
        		set.remove(nums[i-k-1]);
        	}
        	if(set.contains(nums[i])) return true;
    		else {
    			set.add(nums[i]);
    		}
        }
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,1,6,7};
		System.out.println(containsNearbyDuplicate(nums, 3));
		System.out.println(containsNearbyDuplicate(nums, 6));
	}

}
