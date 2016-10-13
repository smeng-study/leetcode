package lcode;

/**
 * 405. Convert a Number to Hexadecimal
 * @author smeng
 *
 */

//Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
//
//Note:
//
//All letters in hexadecimal (a-f) must be in lowercase.
//The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
//The given number is guaranteed to fit within the range of a 32-bit signed integer.
//You must not use any method provided by the library which converts/formats the number to hex directly.
//Example 1:
//
//Input:
//26
//
//Output:
//"1a"
//Example 2:
//
//Input:
//-1
//
//Output:
//"ffffffff"
//	
public class ConvertaNumbertoHexadecimal {
	private static char[] hex = {'a','b','c','d','e','f'};
	public static String toHex(int num) {
		if(num==0) return "0";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<8 && num!=0; i++)  { // int is 32 bits
			int n = num & 0x0000000f; // num & 15
			if(n>=10) {
				sb.append(hex[n-10]);
			}else {
				sb.append(n);
			}
			num = num >>> 4; //2^4 = 16
		}
		return sb.reverse().toString(); //reverse is O(n)
		
	}
	
	public static String toHex2(int num) {
		if(num<10 && num>=0) return Integer.toString(num);
    	char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<8 && num!=0;i++) {
    		sb.insert(0,hex[num & 15]); //O(n)
    		num = num>>4;
    	}
    	return sb.toString();
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 231;
		int num2 = 16;
		System.out.println(toHex(num1));
		System.out.println(toHex2(num2));
	}

}
