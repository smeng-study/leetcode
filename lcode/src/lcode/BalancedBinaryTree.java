package lcode;

/**
 * 110. Balanced Binary Tree
 * @author smeng
 *
 */

//Given a binary tree, determine if it is height-balanced.
//
//For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

public class BalancedBinaryTree {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        boolean isB = true;
        int leftd = depth(root.left);
        int rightd = depth(root.right);
        if(Math.abs(leftd-rightd)>1 || !isBalanced(root.left) || !isBalanced(root.right)) {
        	isB = false;
        }
        return isB;
    }
	
	private static int depth(TreeNode node) {
		if(node==null) return 0;
		return 1+Math.max(depth(node.left),depth(node.right));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(1);
		TreeNode n3 = new TreeNode(1);
		TreeNode n4 = new TreeNode(1);
		TreeNode n5 = new TreeNode(1);
		TreeNode n6 = new TreeNode(1);
		TreeNode n7 = new TreeNode(1);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n4.left = n6;
		n4.right = n7;
		
		System.out.print(isBalanced(n1));
	}

}
