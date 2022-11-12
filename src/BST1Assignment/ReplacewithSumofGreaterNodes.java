package BST1Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReplacewithSumofGreaterNodes {
	
	/*
	 * 5 2 8 1 3 6 10 -1 -1 -1 -1 -1 -1 -1 -1
	 */

	static Stack<BinaryTreeNode<Integer>> stack = new Stack<BinaryTreeNode<Integer>>();
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		moveToStack(root);
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop().data);
//		}
		updateValue();
	}

	public static void moveToStack(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		moveToStack(root.left);
		stack.add(root);
		moveToStack(root.right);
		
	}
	
	public static void updateValue(){
		int sum = 0;
		while(!stack.isEmpty()) {
			BinaryTreeNode<Integer> node = stack.pop();
			node.data += sum;
			sum = node.data;
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
		replaceWithLargerNodesSum(root);
	}

}
