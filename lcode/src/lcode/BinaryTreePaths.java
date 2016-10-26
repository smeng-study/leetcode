package lcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. Binary Tree Paths
 * @author smeng
 *
 */

//Given a binary tree, return all root-to-leaf paths.
//
//For example, given the following binary tree:
//
//   1
// /   \
//2     3
// \
//  5
//All root-to-leaf paths are:
//
//["1->2->5", "1->3"]

public class BinaryTreePaths {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        helper(root, list, sb);
        return list;
    }
	
	private static void helper(TreeNode node, List<String> list, StringBuilder sb) {
		if(node==null) {
			return;
		}
		int len = sb.length();
		if(len==0) {
			sb.append(node.val);
		}else {
			sb.append("->"+node.val);
		}
		if(node.left==null && node.right==null) {
			list.add(sb.toString());
		}else {
			helper(node.left, list, sb);
			helper(node.right, list, sb);
		}
		sb.setLength(len);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n3.right = n5;
		
		List<String> res = binaryTreePaths(n1);
		for(String s: res) {
			System.out.println(s);
		}
		
	}

}
