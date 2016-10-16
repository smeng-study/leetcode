package lcode;

/**
 * 70. Climbing Stairs
 * @author si
 *
 */

//You are climbing a stair case. It takes n steps to reach to the top.
//
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
		
public class ClimbingStairs {

	public static int climbStairs(int n) {
        if(n!=1) {
        	int c1 = 1; // 1 way for 1 step
        	int c2 = 2; // 2 way for 2 steps
        	int start = n-2; // start from the second step
        	while(start-->0) {
        		int pre = c1;
        		c1 = c2;
        		c2 = pre+c1; //f(n) = f(n-1)+f(n-2)
        	}
        	return c2;
        }
        else return 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(climbStairs(5));
	}

}
