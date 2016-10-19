package lcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 107. Binary Tree Level Order Traversal II
 * @author smeng
 *
 */

//Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
//
//For example:
//Given binary tree [3,9,20,null,null,15,7],
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its bottom-up level order traversal as:
//[
//  [15,7],
//  [9,20],
//  [3]
//]

public class BinaryTreeLevelOrderTraversalII {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(root,res,0);
        return res;
    }
	
	private static void helper(TreeNode root, List<List<Integer>> res, int level) {
		if(root==null) return;
		if(level>=res.size()) {
			res.add(0, new ArrayList<Integer>());
		}
		helper(root.left, res, level+1);
		helper(root.right, res, level+1);
		res.get(res.size()-level-1).add(root.val);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode(3);
		TreeNode n2 = new TreeNode(9);
		TreeNode n3 = new TreeNode(20);
		TreeNode n4 = new TreeNode(15);
		TreeNode n5 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		
		System.out.println(levelOrderBottom(n1));
	}

}
