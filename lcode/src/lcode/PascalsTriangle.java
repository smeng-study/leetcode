package lcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * @author smeng
 *
 */

//Given numRows, generate the first numRows of Pascal's triangle.
//
//For example, given numRows = 5,
//Return
//
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]

public class PascalsTriangle {

	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows<1) return res;
        for(int i=0; i<numRows; i++) {
        	List<Integer> row = new ArrayList<Integer>();
        	for(int j=0; j<i+1; j++) {
        		if(j==0||j==i) row.add(1);
        		else {
        			row.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
        		}
        	}
        	res.add(row);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = generate(5);
		for(List<Integer> l: res) {
			for(int i=0; i<l.size(); i++) {
				System.out.print(l.get(i));
			}
			System.out.println();
		}
		
	}

}
