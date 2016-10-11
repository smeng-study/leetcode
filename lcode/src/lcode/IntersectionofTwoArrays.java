package lcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 * @author smeng
 *
 */
//
//Given two arrays, write a function to compute their intersection.
//
//Example:
//Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
//Each element in the result must be unique.
//The result can be in any order.
		
public class IntersectionofTwoArrays {
	public static int[] intersection(int[] nums1, int[] nums2) { 
        if(nums1==null||nums2==null) return null;
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int n1:nums1) {
        	set.add(n1);
        }
        for(int n2:nums2) {
        	if(set.contains(n2)){
        		list.add(n2);
        		set.remove(n2);
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
		int[] n1 = {1,2,2,4,5,6,2};
		int[] n2 = {2,3,5,5};
		int[] res = intersection(n1,n2);
		for(int n:res) {
			System.out.println(n);
		}
		
	}

}
