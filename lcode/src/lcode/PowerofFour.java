package lcode;
/**
 * 342. Power of Four
 * @author si
 *
 */

//Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
//
//Example:
//Given num = 16, return true. Given num = 5, return false.
		
public class PowerofFour {
	public static boolean isPowerOfFour(int num) {
		//get the decimal fraction after dot
        return ((Math.log10(num)/Math.log10(4)) % 1) == 0;
    }
	public static boolean isPowerOfFour2(int num) {
		// only one '1' bit in binary notation,so we use x&(x-1) to delete the lowest '1', if then it becomes 0
		// only '1' bit should be locate at the odd location, 5 in binary is 0101, 0x55555555 is to get rid of those power of 2 but not power of 4
		return num>0 && (num & (num-1))==0 && (num & 0x55555555)==num;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 213;
		int num2 = 32;
		System.out.println(isPowerOfFour2(num1));
		System.out.println(isPowerOfFour2(num2));
	}

}
