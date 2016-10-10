package lcode;
/**
 * 404. Sum of Left Leaves
 * @author smeng
 *
 */
//
//Find the sum of all left leaves in a given binary tree.
//
//Example:
//
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.

public class SumofLeftLeaves {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	private static int sum;
	public static int sumOfLeftLeaves(TreeNode root) {
		findLeft(root, false);
		return sum;
	}
	private static void findLeft(TreeNode node, boolean isLeft) {
		if(node==null) return;
		if(isLeft && node.left==null && node.right==null) {
			sum += node.val;
		}
		findLeft(node.left, true);
		findLeft(node.right, false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode(1);
//		TreeNode n2 = new TreeNode(9);
//		TreeNode n3 = new TreeNode(22);
//		TreeNode n4 = new TreeNode(12);
//		TreeNode n5 = new TreeNode(7);
//		
//		n1.left = n2;
//		n1.right = n3;
//		n3.left = n4;
//		n3.right = n5;
		
		System.out.print(sumOfLeftLeaves(n1));
	}

}
