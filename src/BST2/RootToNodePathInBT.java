package BST2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RootToNodePathInBT {

	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return null;
		}

		if(root.data == x) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}

		ArrayList<Integer> leftOutput = nodeToRootPath(root.left, x);
		if(leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}

		ArrayList<Integer> rightOutput = nodeToRootPath(root.right, x);
		if(rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		}

		return null;
	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = levelwiseInput();
		ArrayList<Integer> path = nodeToRootPath(root,5);
		if(path == null) {
			System.out.println("Not found");
		}else {
			for(int i : path) {
				System.out.println(i);
			}
		}

	}

	/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
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

}
