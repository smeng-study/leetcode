package lcode;

/**
 * 231. Power of Two
 * @author smeng
 *
 */

//Given an integer, write a function to determine if it is a power of two.

public class PowerofTwo {
	public static boolean isPowerOfTwo(int n) {
		if(n==1) return true;
        if(n%2!=0 || n==0) return false;
        return isPowerOfTwo(n/2);
    }
	public static boolean isPowerOfTwo2(int n) {
		return Math.log10(n)/Math.log10(2) % 1 == 0; //modulo by one, get decimal  
    }
	public static boolean isPowerOfTwo3(int n) {
		return n>0 && (n&(n-1))==0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2312;
		int num2 = 256;
		System.out.println(isPowerOfTwo3(num1));
		System.out.println(isPowerOfTwo3(num2));
	}

}
