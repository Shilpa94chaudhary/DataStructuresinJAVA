package BinaryTree1;

import java.util.Scanner;

public class NodesGreaterThanX {

	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return 0;
		}
		int count = 0;
		if(root.data > x) {
			count++;
		}
		count += countNodesGreaterThanX(root.left,x) + countNodesGreaterThanX(root.right,x);
		return count;
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
		int x = 5;
		System.out.println("Nodes greater than " + x + " : " + countNodesGreaterThanX(root,x));

	}

}
