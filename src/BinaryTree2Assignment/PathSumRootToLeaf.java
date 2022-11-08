package BinaryTree2Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PathSumRootToLeaf {


	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return;
		}
		printRootToLeafPath(root,k,"");
	}

	public static void printRootToLeafPath(BinaryTreeNode<Integer> root, int k, String s) {

		if(root.left == null && root.right == null) {
			if(root.data == k) {
				System.out.println(s+root.data);
			}
		}else {
			s = s + root.data + " ";
			if(root.left != null ) {
				printRootToLeafPath(root.left, k-root.data, s);
			}
			if(root.right != null ) {
				printRootToLeafPath(root.right,k-root.data, s);
			}
		}

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
		int sum = 13;
		rootToLeafPathsSumToK(root,sum);

	}

}
