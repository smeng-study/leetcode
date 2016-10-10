package lcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 226. Invert Binary Tree
 * @author smeng
 *
 */

/*Invert a binary tree.

4
/   \
2     7
/ \   / \
1   3 6   9
to
4
/   \
7     2
/ \   / \
9   6 3   1*/

public class InvertBinaryTree {

	 public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	 public static TreeNode invertTree(TreeNode root) {
		 if(root==null) return null;
		 TreeNode right = root.left;
		 TreeNode left = root.right;
		 root.left = invertTree(left);
		 root.right = invertTree(right);
		 return root;
	 }
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeNode n1 = new TreeNode(4);
		 TreeNode n2 = new TreeNode(2);
		 TreeNode n3 = new TreeNode(7);
		 TreeNode n4 = new TreeNode(1);
		 TreeNode n5 = new TreeNode(3);
		 TreeNode n6 = new TreeNode(6);
		 TreeNode n7 = new TreeNode(9);
		 
		 n1.left = n2;
		 n1.right = n3;
		 n2.left = n4;
		 n2.right = n5;
		 n3.left = n6;
		 n3.right = n7;
		 
		 invertTree(n1);
		 
		 Queue<TreeNode> s = new LinkedList<TreeNode>();
		 s.offer(n1);
		 while(!s.isEmpty()) {
			 TreeNode n = s.poll();
			 System.out.println(n.val);
			 if(n.left!=null) {
				 s.offer(n.left);
			 }
			 if(n.right!=null) {
				 s.offer(n.right);
			 }
		 }
		 
	 }
}
