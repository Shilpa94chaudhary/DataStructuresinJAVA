package BinaryTree2;

import java.util.Scanner;

public class DiameterOfBinaryTree {
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		if(root == null) {
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return 2+leftHeight+rightHeight;
	}
	
	public static int height(BinaryTreeNode<Integer> root){
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
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
		System.out.println("Diameter of the Tree: " + diameterOfBinaryTree(root));
		
	}

}
