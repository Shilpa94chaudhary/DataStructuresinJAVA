package BinaryTree1;

import java.util.Scanner;

public class NodesWithoutSibling {

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		if(root.left != null && root.right == null) {
			System.out.print(root.left.data + " ");
			
		}else if(root.left == null && root.right != null) {
			System.out.print(root.right.data + " ");
			
		}
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}
	
	// Take input for binary tree
	public static BinaryTreeNode<Integer> takeTreeInput(boolean isRoot, int parentData, boolean isLeft){

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		if(isRoot) {
			System.out.println("Enter the root data : ");
		}else {
			if(isLeft) {
				System.out.println("Enter left of " + parentData +" : ");
			}else {
				System.out.println("Enter right of " + parentData +" : ");
			}
		}

		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer> (rootData);
		root.left = takeTreeInput(false, rootData, true);
		root.right = takeTreeInput(false, rootData, false);

		return root;

	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = takeTreeInput(true, 0, false);
		printNodesWithoutSibling(root);

	}

}
