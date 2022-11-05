package BinaryTree2;

import java.util.Scanner;

public class TreeIsBalances {

	public static int findHeight(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}

		int leftHeight = findHeight(root.left);
		int rightHeight = findHeight(root.right);

		return 1 + Math.max(leftHeight, rightHeight);

	}

	public static boolean isTreeBalanced(BinaryTreeNode<Integer> root) {

		if(root == null) {
			return true;
		}
		int leftHeight = findHeight(root.left);
		int rightHeight = findHeight(root.right);

		if(Math.abs(leftHeight- rightHeight)>1) {
			return false;
		}

		boolean isLeftBalanced = isTreeBalanced(root.left);
		boolean isRightBalanced = isTreeBalanced(root.right);

		return isLeftBalanced && isRightBalanced;

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
		System.out.println(isTreeBalanced(root));
	}

}
