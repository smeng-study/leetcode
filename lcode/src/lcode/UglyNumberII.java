package lcode;

/**
 * 264. Ugly Number II
 * @author si
 *
 */

//Write a program to find the n-th ugly number.
//
//Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
//
//Note that 1 is typically treated as an ugly number.

public class UglyNumberII {
	
	public static int nthUglyNumber(int n) {
		if(n<=6) return n;
		int pointer2 = 0, pointer3 = 0, pointer5 = 0;
        int res[] = new int[n];
        res[0] = 1;
        for(int i = 1; i<n; i++) {
        	int min = Math.min(res[pointer2]*2, Math.min(res[pointer3]*3, res[pointer5]*5));
        	//use if to avoid duplicate
        	if(min == res[pointer2]*2) pointer2++;
        	if(min == res[pointer3]*3) pointer3++;
        	if(min == res[pointer5]*5) pointer5++;
        	res[i] = min;
        }
        return res[n-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthUglyNumber(10));
	}

}
