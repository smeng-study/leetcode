package lcode;

/**
 * 283. Move Zeroes
 * @author smeng
 *
 */
/*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
*/
public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
        if(nums==null||nums.length<2) {
        	return;
        }
        int len = nums.length;
        int count = 0;
        for(int i=0; i<len; i++) {
        	if(nums[i]==0) {
        		count++;
        	}else{
        		nums[i-count] = nums[i];
        	}
        }
        for(int j=len-count; j<len; j++) {
        	nums[j] = 0;
        }
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,6,0,4,0,0,10,23,0,5,0};
		moveZeroes(nums);
		for(int i:nums) {
			System.out.print(i);
		}
		
	}

}
