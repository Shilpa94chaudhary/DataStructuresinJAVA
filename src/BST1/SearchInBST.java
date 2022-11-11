package BST1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchInBST {

	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return false;
		}
		
		if(root.data == k) {
			return true;
		}
		
		if(root.data > k) {
			return searchInBST(root.left, k);
		}else {
			return searchInBST(root.right, k);
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
		System.out.println(searchInBST(root,5));
		
	}

}
