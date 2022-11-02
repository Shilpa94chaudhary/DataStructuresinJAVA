package BinaryTree1;

import java.util.Scanner;

public class PrintNodeAtDepthK {

	public static void printNodeAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return;
		}
		if(k==0) {
			System.out.println(root.data + " ");
		}else {
			printNodeAtDepthK(root.left, k-1);
			printNodeAtDepthK(root.right, k-1);
		}
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
		printNodeAtDepthK(root,4);

	}

}
