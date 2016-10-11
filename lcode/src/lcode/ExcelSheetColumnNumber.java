package lcode;
/**
 * 171. Excel Sheet Column Number
 * @author smeng
 *
 */
//Given a column title as appear in an Excel sheet, return its corresponding column number.
//
//For example:
//
//    A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28 

public class ExcelSheetColumnNumber {
	public static int titleToNumber(String s) {
        if(s==null) return 0;
        int res = 0;
        for(int i=0; i<s.length(); i++) {
        	res = res*26 + s.charAt(i)-'A'+1;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String col = "AB";
		System.out.println(titleToNumber(col));
	}

}
