package lcode;
/**
 * 191. Number of 1 Bits
 * @author smeng
 *
 */

//Write a function that takes an unsigned integer and returns the number of Õ1' bits it has (also known as the Hamming weight).
//
//For example, the 32-bit integer Õ11' has binary representation 00000000000000000000000000001011, so the function should return 3.

public class Numberof1Bits {
	public static int hammingWeight(int n) {
		if(n==0||n==1) return n;
		int count = 0;
        for(int i=0; i<32; i++) {
        	count += n&1;
        	n = n>>>1;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(1));
		System.out.println(hammingWeight(11));
		System.out.println(hammingWeight(-1));
	}

}
