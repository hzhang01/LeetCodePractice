package day1;

/*
 * @author Han Zhang
 * 
 * Merging two binary trees
 */

public class MergingBinaryTrees {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);
		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.left.right = new TreeNode(4);
		t2.right = new TreeNode(3);
		t2.right.right = new TreeNode(7);
		TreeNode result = new TreeNode(0);
		result = mergeTrees(t1, t2);
		traversal(result);
	}
	
	public static void traversal (TreeNode n){
		if(n == null){
			return;
		}
		traversal(n.left);
		System.out.println(n.val);
		traversal(n.right);
	}
	/*
	 * Duplicate the tree for in-order traversal and summation. 
	 */

	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		TreeNode r1 = t1;
		TreeNode r2 = t2;
		return mergeTreeRec(r1,r2);
	}

	/*
	 * Using recursion to add one tree on top of another tree 
	 */
	
	private static TreeNode mergeTreeRec (TreeNode r1, TreeNode r2) {
		if(r1 == null && r2 == null){
			return null;
		}
		else if(r1 == null){
			return r2;
		}
		else if(r2 == null){
			return r1;
		}
		r1.left = mergeTreeRec(r1.left,r2.left);
		r1.right = mergeTreeRec(r1.right,r2.right);
		r1.val += r2.val;
		return r1;
	}

}


// Given TreeNode Class 

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){ 
		val = x; 
	}
}