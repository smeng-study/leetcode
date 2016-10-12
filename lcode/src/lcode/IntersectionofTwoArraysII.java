package lcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 350. Intersection of Two Arrays II
 * @author smeng
 *
 */

//Given two arrays, write a function to compute their intersection.
//
//Example:
//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
//
//Note:
//Each element in the result should appear as many times as it shows in both arrays.
//The result can be in any order.
//Follow up:
//What if the given array is already sorted? How would you optimize your algorithm?
//What if nums1's size is small compared to nums2's size? Which algorithm is better?
//What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
//		
public class IntersectionofTwoArraysII {
	public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n1: nums1) {
        	if(map.containsKey(n1)) {
        		map.put(n1, map.get(n1)+1);
        	}else {
        		map.put(n1, 1);
        	}
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int n2: nums2) {
        	if(map.containsKey(n2)) {
        		list.add(n2);
        		map.put(n2, map.get(n2)-1);
        		if(map.get(n2)==0) {
        			map.remove(n2);
        		}
        	}
        }
        int[] res = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	res[i] = list.get(i);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,2,3,5,6};
		int[] nums2 = {3,4,3,2,2};
		int[] res = intersect(nums1,nums2);
		for(int n : res) {
			System.out.print(n+" ");
		}
		
	}

}
