package BinaryTree2;

import java.util.Scanner;

public class CheckBalanced {
	
	public static BalanceTreeReturn checkBalanced(BinaryTreeNode<Integer> root) {
		BalanceTreeReturn ans = new BalanceTreeReturn();
		
		// Check base case
		if(root == null) {
			ans.height = 0;
			ans.isBalance = true;
			return ans;
		}
		
		BalanceTreeReturn leftOutput = checkBalanced(root.left);
		BalanceTreeReturn rightOutput = checkBalanced(root.right);
		
		ans.isBalance = true;
		ans.height = 1 + Math.max(leftOutput.height, rightOutput.height);
		
		if(leftOutput.isBalance == false || rightOutput.isBalance == false) {
			ans.isBalance = false;
		}
		
		if(Math.abs(leftOutput.height - rightOutput.height) > 1) {
			ans.isBalance = false;
		}
		
		return ans;
		
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
		System.out.println("Tree is balanced: " + checkBalanced(root).isBalance);
	}
}
