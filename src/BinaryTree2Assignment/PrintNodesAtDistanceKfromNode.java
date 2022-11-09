package BinaryTree2Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintNodesAtDistanceKfromNode {

	/*
	 * 				3
	 * 			5		1
	 * 		  6	  2	  0	  8
	 * 			 7 4
	 * 
	 * node = 5
	 * k = 2
	 */
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		
		int i = print(root, node, k);
		
	}
	
	public static int print(BinaryTreeNode<Integer> root, int node, int k) {
		if(root == null) {
			return -1;
		}
		
		if(root.data == node) {
			printAtDepthK(root,k);
		}
		
		int lD = print(root.left, node, k);
		int rD;
		
		if(lD == -1) {
			rD = print(root.right, node, k);
			if(rD == -1) {
				return -1;
			}else if(rD + 1 == k) {
				System.out.println(root.data);
				return k;
			}
		}else if(lD+1 == k) {
			System.out.println(root.data);
			return k;
		}else {
			printAtDepthK(root.right, k-lD+2);
			return lD+1;
		}
		return 0;
	}
	
	public static void printAtDepthK(BinaryTreeNode<Integer> root, int depth) {
		if(root == null) {
			return;
		}
		
		if(depth == 0 && root != null) {
			System.out.println(root.data);
			return;
		}
		
		printAtDepthK(root.left, depth-1);
		printAtDepthK(root.right, depth-1);
		
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
		nodesAtDistanceK(root, 3, 2);
	}

}
