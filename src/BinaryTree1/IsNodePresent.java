package BinaryTree1;

import java.util.Scanner;

public class IsNodePresent {

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		if(root.data == x) {
			return true;
		}
		boolean isPresent = isNodePresent(root.left, x) || isNodePresent(root.right, x);

		return isPresent;
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
		System.out.println(isNodePresent(root,4));

	}

}
