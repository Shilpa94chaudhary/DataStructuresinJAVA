package BST1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ElementsBetweenK1AndK2 {

	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){

		if(root == null) {
			return;
		}
		
		if(root.data > k1) {
			elementsInRangeK1K2(root.left, k1, k2);
		}
		if(root.data >= k1 && root.data <= k2) {
			System.out.print(root.data + " ");
		}
		if(root.data < k2 ) {
			elementsInRangeK1K2(root.right, k1, k2);
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
		elementsInRangeK1K2(root,14,17);

	}

}
