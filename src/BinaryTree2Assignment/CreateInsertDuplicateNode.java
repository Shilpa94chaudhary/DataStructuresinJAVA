package BinaryTree2Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateInsertDuplicateNode {

	/*
	 * Input Binary Tree
	 * 			10
	 * 		20		30
	 * 	  40  50      60
	 * 
	 * Output Binary Tree
	 * 				10
	 * 			10		30
	 * 	 	  20      30  60
	 *     20    50		 60
	 * 	  40   50
	 * 	 40
	 */
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			return;
		}
		
		BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
		newNode.left = root.left;
		root.left = newNode;
		insertDuplicateNode(newNode.left);
		insertDuplicateNode(root.right);
		
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

	// Print the binary tree
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

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = levelwiseInput();
		insertDuplicateNode(root);
		printLevelWise(root);

	}

}
