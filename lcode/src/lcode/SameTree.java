package lcode;
/**
 * 100. Same Tree
 * @author smeng
 *
 */

//Given two binary trees, write a function to check if they are equal or not.
//
//Two binary trees are considered equal if they are structurally identical and the nodes have the same value.

public class SameTree {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(1);
		TreeNode n6 = new TreeNode(2);
		TreeNode n7 = new TreeNode(3);
		TreeNode n8 = new TreeNode(4);
		TreeNode n9 = new TreeNode(5);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		
		n5.left = n6;
		n5.right = n7;
		n6.left = n8;
		
		System.out.println(isSameTree(n1,n5));
		n6.right = n9;
		System.out.println(isSameTree(n1,n5));
	}

}
