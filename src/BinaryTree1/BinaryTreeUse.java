package BinaryTree1;

public class BinaryTreeUse {

	// Print the binary tree
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+": ");
		if(root.left != null) {
			System.out.print("L "+root.left.data+", ");
		}
		if(root.right != null) {
			System.out.print("R "+root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);

		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(4);

		root.left = rootLeft;
		root.right = rootRight;

		BinaryTreeNode<Integer> rootLeftRight = new BinaryTreeNode<Integer>(3);
		BinaryTreeNode<Integer> rootRightLeft = new BinaryTreeNode<Integer>(5);

		rootLeft.right = rootLeftRight;
		rootRight.left = rootRightLeft;

//		printTree(root);
		printTreeDetailed(root);

	}

}
