package lcode;

/**
 * 172. Factorial Trailing Zeroes
 * @author smeng
 *
 */

//Given an integer n, return the number of trailing zeroes in n!.
//
//Note: Your solution should be in logarithmic time complexity.

public class FactorialTrailingZeroes {

	public static int trailingZeroes(int n) {
        //count 5
		if(n<5) return 0;
		return n/5+trailingZeroes(n/5);
    }
	
	public static int trailingZeroes2(int n) {
        //count 5
		int cnt = 0;
		while(n!=0) {
			n /= 5;
			cnt += n;
		}
		return cnt;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(trailingZeroes2(200));
	}

}
