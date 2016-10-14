package lcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. Happy Number
 * @author si
 *
 */

//Write an algorithm to determine if a number is "happy".
//
//A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
//
//Example: 19 is a happy number
//
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1

public class HappyNumber {
	private static Set<Integer> set = new HashSet<Integer>();
	public static boolean isHappy(int n) {
		int sum = 0;
        while(n!=0) {
        	int current = n%10;
        	sum += current*current;
        	n /= 10;
        }
        if(set.contains(sum)) return false;
        if(sum!=1) {
        	set.add(sum);
        	return isHappy(sum);
        }
        else {
        	return true;
        }
    }
	
	//cheat version, 4 is the unhappy number
	public static boolean isHappy2(int n) {
		int sum = 0;
        while(n!=0) {
        	int current = n%10;
        	sum += current*current;
        	n /= 10;
        }
        if(sum==4) return false;
        if(sum!=1) {
        	return isHappy(sum);
        }
        else {
        	return true;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 19;
		int num2 = 14;
		System.out.println(isHappy2(num1));
		System.out.println(isHappy2(num2));
	}

}
