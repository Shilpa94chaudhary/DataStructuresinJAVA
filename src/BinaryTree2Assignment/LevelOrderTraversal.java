package BinaryTree2Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {

	// Print Binary Tree Level wise
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
		Queue<BinaryTreeNode<Integer>> queueTemp = new LinkedList<BinaryTreeNode<Integer>>();

		queue.add(root);
		System.out.println(root.data + " ");
		
		
		while(!queue.isEmpty()) {
			
			while(!queue.isEmpty()) {
				BinaryTreeNode<Integer> newNode = queue.poll();

				if(newNode.left != null) {
					System.out.print(newNode.left.data + " ");
					queueTemp.add(newNode.left);
				}

				if(newNode.right != null) {
					System.out.print(newNode.right.data + " ");
					queueTemp.add(newNode.right);
				}
			}
			System.out.println();
			while(!queueTemp.isEmpty()) {
				queue.add(queueTemp.poll());
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
		printLevelWise(root);

	}

}
