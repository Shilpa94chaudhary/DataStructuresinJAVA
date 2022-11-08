package BinaryTree2Assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinimumMaximumInBinaryTree {

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		Pair <Integer, Integer> minMax = new Pair <Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);

		if(root == null) {
			return minMax;
		}

		Pair <Integer, Integer> minMaxLeft = getMinAndMax(root.left);
		Pair <Integer, Integer> minMaxRight = getMinAndMax(root.right);


		// Find minimum among Left Child, Right Child and root
		if(minMaxLeft.minimum < minMaxRight.minimum ) {
			if(root.data < minMaxLeft.minimum) {
				minMax.minimum = root.data;
			}else {
				minMax.minimum = minMaxLeft.minimum;
			}
		}else {
			if(root.data < minMaxRight.minimum) {
				minMax.minimum = root.data;
			}else {
				minMax.minimum = minMaxRight.minimum;
			}
		}

		// Find maximum among Left Child, Right Child and root
		if(minMaxLeft.maximum > minMaxRight.maximum ) {
			if(root.data > minMaxLeft.maximum) {
				minMax.maximum = root.data;
			}else {
				minMax.maximum = minMaxLeft.maximum;
			}
		}else {
			if(root.data > minMaxRight.maximum) {
				minMax.maximum = root.data;
			}else {
				minMax.maximum = minMaxRight.maximum;
			}
		}

		return minMax;

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
		Pair <Integer, Integer> minMax = getMinAndMax(root);
		System.out.println(minMax.minimum + " " + minMax.maximum);

	}

}
