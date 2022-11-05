package BinaryTree2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintLevelwiseBinary {
	/*
	 * 1:L:2,R:3
	 * 2:L:4,R:-1
	 * 3:L:5,R:6
	 * 4:L:-1,R:7
	 * 5:L:-1,R:-1
	 * 6:L:-1,R:-1
	 * 7:L:-1,R:-1
	 */
	
	// Levelwise print binary tree
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
		
		queue.add(root);
		while(!queue.isEmpty()) {

			BinaryTreeNode<Integer> printNode = queue.poll();
			System.out.print(printNode.data + ":");
			if(printNode.left == null) {
				System.out.print("L:-1,");
			}else {
				System.out.print("L:" + printNode.left.data+ ",");
				queue.add(printNode.left);
			}

			if(printNode.right == null) {
				System.out.print("R:-1");
			}else {
				System.out.print("R:" + printNode.right.data);
				queue.add(printNode.right);
			}
			System.out.println();
		}
	}

	// Levelwise input in binary tree
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
		printLevelWise(root);

	}

}
