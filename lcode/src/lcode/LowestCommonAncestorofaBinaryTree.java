package lcode;

/**
 * 236. Lowest Common Ancestor of a Binary Tree
 * @author smeng
 *
 */

//Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
//
//According to the definition of LCA on Wikipedia: ÒThe lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).Ó
//
//        _______3______
//       /              \
//    ___5__          ___1__
//   /      \        /      \
//   6      _2       0       8
//         /  \
//         7   4
//For example, the lowest common ancestor (LCA) of nodes 5 and 1 is 3. Another example is LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

public class LowestCommonAncestorofaBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null||root==p||root==q) return root;
		TreeNode leftSearch = lowestCommonAncestor(root.left,p,q);
		TreeNode rightSearch = lowestCommonAncestor(root.right,p,q);
		if(leftSearch!=null && rightSearch!=null) return root;
		else if(leftSearch!=null && rightSearch==null) return leftSearch;
		else if(leftSearch==null && rightSearch!=null) return rightSearch;
		else return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
