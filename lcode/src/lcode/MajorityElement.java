package lcode;

/**
 * 169. Majority Element
 * @author smeng
 *
 */

//Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.
//
//You may assume that the array is non-empty and the majority element always exist in the array.

public class MajorityElement {
	public static int majorityElement(int[] nums) {
        int count = 1;
        int major = nums[0];
        for(int i=1; i<nums.length; i++) {
        	if(major==nums[i]){        		
        		count++;
        	}else if(count==0) {
        		major = nums[i];
        		count++;
        	}else {
        		count--;
        	}
        }
        return major; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,2,2,2,2,2,3,4,5,2,3,1,1};
		System.out.println(majorityElement(nums));
	}

}
