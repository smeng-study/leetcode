package lcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 229. Majority Element II
 * @author smeng
 *
 */

//Given an integer array of size n, find all elements that appear more than n/3 times. 
//The algorithm should run in linear time and in O(1) space.

public class MajorityElementII {
	public static List<Integer> majorityElement(int[] nums) {
		return helper(nums, 3);
	}

	public static List<Integer> helper(int[] nums, int k) {
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}
			//check key #, if <k, add to map 
			else if(map.keySet().size()<k-1) {
				map.put(nums[i], 1);
			}
			else {
				boolean flag = false;
				for(Integer key: map.keySet()) {
					if(map.get(key) == 0) {
						map.remove(key);
						map.put(nums[i], 1);
						flag = true;
						break;
					}
				}
				if(flag==false) {
					for(Integer key:map.keySet()) {
						// each candidate number decrease
						map.put(key, map.get(key)-1);
					}
				}
			}
		}
		//initial each candidate number to 0
		for(Integer key: map.keySet()) {
			map.put(key, 0);
		}
		for(int n: nums) {
			if(map.containsKey(n)) {
				map.put(n, map.get(n)+1);
			}
		}
		for(Integer key: map.keySet()) {
			if(map.get(key)>nums.length/k) {
				list.add(key);
			}
		}
		return list;
	}

	//	public static List<Integer> majorityElement(int[] nums) {
	//		List<Integer> list = new ArrayList<Integer>();
	//		int res1 = 0;
	//        int res2 = 0;
	//        int c1 = 0, c2 = 0;
	//        for(int num: nums) {
	//        	
	//        	if(num==res1) {
	//        		c1++;
	//        	}else if(num==res2) {
	//        		c2++;
	//        	}else if(c1==0) {
	//        		res1 = num;
	//        		c1++;
	//        	}else if(c2==0) {
	//        		res2 = num;
	//        		c2++;
	//        	}else {
	//        		c1--;
	//        		c2--;
	//        	}
	//        }
	//        
	//        c1 = 0;
	//        c2 = 0;
	//        for(int num:nums) {
	//        	if(num==res1) c1++;
	//        	if(num==res2) c2++;
	//        }
	//
	//        if(c1>nums.length/3) {
	//        	list.add(res1);
	//        }
	//        if(c2>nums.length/3 && res1!=res2) {
	//        	list.add(res2);
	//        }
	//        return list;
	//    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {1,2,2,3,2,1,1,3};
		System.out.println(majorityElement(s));
	}

}
