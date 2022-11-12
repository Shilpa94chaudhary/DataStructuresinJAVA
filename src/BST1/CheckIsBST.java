package BST1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckIsBST {

	// isBST function to check if given Binary Tree is BST or not
	public static boolean isBST(BinaryTreeNode<Integer> root) {

		if(root == null) {
			return true;
		}

		return isBSTHelper(root).isBST;
	}

	// Helper function to check Binary Tree is BST or not
	public static isBSTPair isBSTHelper(BinaryTreeNode<Integer> root) {
		if(root == null) {
			isBSTPair result = new isBSTPair(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return result;
		}

		isBSTPair left = isBSTHelper(root.left);
		isBSTPair right = isBSTHelper(root.right);

		int min = Math.min(root.data, Math.min(left.min, right.min));
		int max = Math.max(root.data, Math.max(left.max, right.max));
		boolean isBST = true;

		if(root.data < left.max) {
			isBST = false;
		}else if(root.data > right.min) {
			isBST = false;
		}else if(left.isBST == false || right.isBST == false) {
			isBST = false;
		}

		isBSTPair result = new isBSTPair(min, max, isBST);
		return result;

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
