package lcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 * @author smeng
 *
 */

//Given an index k, return the kth row of the Pascal's triangle.
//
//For example, given k = 3,
//Return [1,3,3,1].
//
//Note:
//Could you optimize your algorithm to use only O(k) extra space?
		
public class PascalsTriangleII {
	
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> prelist = new ArrayList<Integer>();
		prelist.add(1);
        for(int i=1; i<=rowIndex; i++) {
        	prelist = helper(i, prelist);
        }
        return prelist;
    }
	
	private static List<Integer> helper(int idx, List<Integer> prelist) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		for(int i=1; i<idx; i++) {
			list.add(prelist.get(i-1)+prelist.get(i));
		}
		list.add(1);
		return list;
	}
	
	public static List<Integer> getRow2(int rowIndex) {
		List<Integer> tmp = new ArrayList<Integer>();
		tmp.add(1);
		if(rowIndex==0) return tmp;
		List<Integer> prelist = getRow2(rowIndex-1);
        for(int i=0; i<rowIndex-1; i++) {
        	tmp.add(prelist.get(i)+prelist.get(i+1));
        }
        tmp.add(1);
        return tmp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> res = getRow2(4);
		for(Integer i: res) {
			System.out.println(i);
		}
	}

}
