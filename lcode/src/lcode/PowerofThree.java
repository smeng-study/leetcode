package lcode;
/**
 * 326. Power of Three
 * @author smeng
 *
 */

//Given an integer, write a function to determine if it is a power of three.
//
//Follow up:
//Could you do it without using any loop / recursion?

public class PowerofThree {
	public static boolean isPowerOfThree(int n) {
		while(n%3==0 && n!=0) {
			n /= 3;
		}
		if(n==1) return true;
		return false;
	}
	//if the largest power of 3 can divide n, then n is power of 3
	public static boolean isPowerOfThree2(int n) {
		int largest = (int) (Math.log(Integer.MAX_VALUE)/Math.log(3));
		return Math.pow(3, largest)%n==0;
	}
	//log10(n)/log10(3) is int, then n is power of 3
	public static boolean isPowerOfThree3(int n) {
		double power = Math.log10(n)/Math.log10(3);
		return (power-Math.floor(power))==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 99;
		int num2 = 243;
		System.out.println(isPowerOfThree3(num1));
		System.out.println(isPowerOfThree3(num2));
	}

}
