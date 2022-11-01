package BinaryTree1;

import java.util.Scanner;

public class InputBinaryTree {

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
		
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
		root.left = takeTreeInputBetter(false, rootData, true);
		root.right = takeTreeInputBetter(false, rootData, false);
		
		return root;
		
	}

	public static BinaryTreeNode<Integer> takeTreeInput(){
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data : ");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer> (rootData);
		root.left = takeTreeInput();
		root.right = takeTreeInput();
		
		return root;
		
	}
	
	// Print the tree
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
	
	public static void main(String[] args) {
		
//		BinaryTreeNode<Integer> root = takeTreeInput();
//		printTreeDetailed(root);
		
		BinaryTreeNode<Integer> root1 = takeTreeInputBetter(true, 0, false);
		printTreeDetailed(root1);
		
	}

}
