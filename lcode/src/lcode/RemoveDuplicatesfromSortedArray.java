package lcode;

/**
 * 26. Remove Duplicates from Sorted Array
 * @author smeng
 *
 */

//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
//
//Do not allocate extra space for another array, you must do this in place with constant memory.
//
//For example,
//Given input array nums = [1,1,2],
//
//Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

public class RemoveDuplicatesfromSortedArray {

	public static int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return 1;
        int j = 0;
        for(int i=1; i<nums.length && j<nums.length; i++) {
        	if(nums[j]!=nums[i]) {
        		nums[++j] = nums[i];
        	}
        }
        return j+1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,2,4,5,6};
		System.out.print(removeDuplicates(nums));
	}

}
