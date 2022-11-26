package BST2;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

	private BinaryTreeNode<Integer> root;
	private int size;

	// Find if the given number is present in the BST or not
	private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
		if(node == null) {
			return false;
		}

		if(node.data == x) {
			return true;
		}

		if(x < node.data) {
			return isPresentHelper(node.left, x);
		}else {
			return isPresentHelper(node.right, x);
		}
	}

	public boolean isPresent(int x) {
		return isPresentHelper(root, x);
	}

	public static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x){
		if(node == null) {
			BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(x);
			return newRoot;
		}
		
		if(x >= node.data) {
			node.right = insertHelper(node.right,x);
		}else {
			node.left = insertHelper(node.left,x);
		}
		return node;	
	}
	
	public void insert(int x) {
		root = insertHelper(root,x);
		size++;
	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		
		int minLeft = minimum(root.left);
		int minRight = minimum(root.right);
		return Math.min(root.data, Math.min(minLeft, minRight));
		
	}
	
	public int size() {
		return size;
	}
	
	private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x){
		if(root == null) {
			return new BSTDeleteReturn(null, false);
		}
		
		if(root.data < x) {
			BSTDeleteReturn outputRight = deleteDataHelper(root.right,x);
			root.right = outputRight.root;
			outputRight.root = root;
			return outputRight;
		}
		
		if(root.data > x) {
			BSTDeleteReturn outputLeft = deleteDataHelper(root.left,x);
			root.left = outputLeft.root;
			outputLeft.root = root;
			return outputLeft;
		}
		
		// If 0 children
		if(root.left == null && root.right == null) {
			return new BSTDeleteReturn(null, true);
		}
		
		// Only letf child
		if(root.left != null && root.right == null) {
			return new BSTDeleteReturn(root.left, true);
		}
		
		// Only right child
		if(root.left == null && root.right != null) {
			return new BSTDeleteReturn(root.right, true);
		}
		
		// both children are present
		int rightMin = minimum(root.right);
		root.data = rightMin;
		BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMin);
		root.right = outputRight.root;
		return new BSTDeleteReturn(root, true);
		
	}
	
	public boolean deleteData(int x) {
		BSTDeleteReturn output = deleteDataHelper(root,x);
		root = output.root;
		if(output.delete) {
			size--;
		}
		return output.delete;
	}

	// Print tree
	private static void printTreeHelper(BinaryTreeNode<Integer> root) {
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
	
	public void printTree() {
		printTreeHelper(root);
	}

}
