package BST2;

import java.util.*;

public class PairSumInBST {
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		// Write your code here

		List<Integer> arr = new ArrayList<>();
		inorder(arr, root);
		int i = 0, j = arr.size() - 1;
		while (i < j) {
			if (arr.get(i) + arr.get(j) > s)
				j--;
			else if (arr.get(i) + arr.get(j) < s)
				i++;
			else {
				System.out.println(arr.get(i) + " " + arr.get(j));
				i++;
				j--;
			}
		}
	}

	public static void inorder(List<Integer> arr, BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		inorder(arr, root.left);
		arr.add(root.data);
		inorder(arr, root.right);
	}

	public static void main(String[] args) {

	}
}
