package lcode;

/**
 * 371. Sum of Two Integers
 * @author smeng
 *
 */

//Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
//
//Example:
//Given a = 1 and b = 2, return 3.
//Thanks to:
//https://discuss.leetcode.com/topic/50315/a-summary-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently
		
public class SumofTwoIntegers {
	
	public static int getSum(int a, int b) {
		int sum = a;
		int carry = 0;
		while(b!=0) {
			carry = sum&b;
			sum = sum^b;
			b = carry<<1;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 32;
		int b = 29;
		System.out.println(getSum(a,b));
	}

}
