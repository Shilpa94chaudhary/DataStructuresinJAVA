package BST1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckIfBinaryTreeIsBST {

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		if(root==null)
			return true;
		int max=maximum(root.left);
		int min=minimum(root.right);
		
		if(root.data<=max || root.data>min)
			return false;

		boolean ans1=isBST(root.left);
		boolean ans2=isBST(root.right);
		return(ans1&& ans2);

	}
	
	public static int maximum(BinaryTreeNode<Integer> root) {
		if(root==null)
			return Integer.MIN_VALUE;
		return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));

	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root==null)
			return Integer.MAX_VALUE;
		return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
	}

	// Take binary tree input
	private static BinaryTreeNode<Integer> levelwiseInput() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data : ");
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}

		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();

		BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(data);
		queue.add(node);
		while(!queue.isEmpty()) {

			BinaryTreeNode<Integer> temp = queue.poll();

			System.out.println("Enter left of " + temp.data + " : ");
			data = s.nextInt();
			if(data == -1) {
				temp.left = null;
			}else {
				BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(data);
				queue.add(left);
				temp.left = left;
			}

			System.out.println("Enter right of " + temp.data + " : ");
			data = s.nextInt();
			if(data == -1) {
				temp.right = null;
			}else {
				BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(data);
				queue.add(right);
				temp.right = right;
			}
		}

		return node;
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = levelwiseInput();
		System.out.println(isBST(root));

	}

}
