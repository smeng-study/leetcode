package lcode;

/**
 * 258. Add Digits
 * @author smeng
 *
 */

//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//
//For example:
//
//Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

public class AddDigits {
	public static int addDigits(int num) {
		int res = 0;
		while(num>0){
			res += num%10;
			num /= 10;
		}
		if(res>=10) {
			return addDigits(res);
		}else {
			return res;
		}
		//num==0? 0:(num%9==0? 9:num%9);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 38;
		System.out.println(addDigits(num));
	}

}
