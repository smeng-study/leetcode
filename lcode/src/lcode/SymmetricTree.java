package lcode;
/**
 * 101. Symmetric Tree
 * @author smeng
 *
 */

//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//    1
//   / \
//  2   2
// / \ / \
//3  4 4  3
//But the following [1,2,2,null,3,null,3] is not:
//    1
//   / \
//  2   2
//   \   \
//   3    3
//Note:
//Bonus points if you could solve it both recursively and iteratively.

public class SymmetricTree {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left, root.right);
    }
	
	private static boolean isMirror(TreeNode p, TreeNode q) {
		if(p==null && q==null) return true;
		if(p==null || q==null) return false;
		if(p.val == q.val) return isMirror(p.left,q.right) && isMirror(p.right,q.left);
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(2);
		TreeNode n4 = new TreeNode(3);
		TreeNode n5 = new TreeNode(3);
		TreeNode n6 = new TreeNode(4);
		TreeNode n7 = new TreeNode(4);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n3.right = n5;
		n2.right = n6;
		n3.left = n7;
		
		System.out.println(isSymmetric(n1));
	}

}
