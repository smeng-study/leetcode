package lcode;

/**
 * 27. Remove Element
 * @author smeng
 *
 */

//Given an array and a value, remove all instances of that value in place and return the new length.
//
//Do not allocate extra space for another array, you must do this in place with constant memory.
//
//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
//
//Example:
//Given input array nums = [3,2,2,3], val = 3
//
//Your function should return length = 2, with the first two elements of nums being 2.

public class RemoveElement {
	
	public static int removeElement(int[] nums, int val) {
		// two pointer, i for search forward, index for save after removed position
        int index = 0;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i]!=val) {
        		nums[index++] = nums[i];
        	}
        }
        return index;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,3,2,2};
		int val = 2;
		int res = removeElement(nums,val);
		for(int n:nums) {
			System.out.println(n);
		}
		System.out.print(res);
	}

}
