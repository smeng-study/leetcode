package lcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * @author smeng
 *
 */

//Given an array of integers, find if the array contains any duplicates.
//Your function should return true if any value appears at least twice in the array, 
//and it should return false if every element is distinct.

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length<2) return false;
        Set<Integer> set = new HashSet<Integer>();
        for(int n:nums) {
        	if(set.contains(n)) {
        		return true;
        	}else {
        		set.add(n);
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,4};
		int[] nums2 = {2,3,4,5,6,8,9,0};
		System.out.println(containsDuplicate(nums));
		System.out.println(containsDuplicate(nums2));
	}

}
